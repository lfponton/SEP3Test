using System;
using System.IO;
using System.Net.Sockets;
using System.Text;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Threading.Tasks;
using DataServer.Models;
using DataServer.DataAccess;
using DataServer.Network;

namespace DataServer.Network
{
    public class ServerHandler
    {
        private TcpClient client;
        private IDaoFactory daoFactory;

        private StreamWriter writer;
        private StreamReader reader;

        private bool clientConnected;

        private JsonSerializerOptions options;
        private JsonSerializerOptions optionsWithoutConverter;
        public ServerHandler(TcpClient client, IDaoFactory daoFactory)
        {
            this.client = client;
            this.daoFactory = daoFactory;
            
            options = new JsonSerializerOptions
            {
                PropertyNamingPolicy = JsonNamingPolicy.CamelCase,
                
                // ReferenceHandler = ReferenceHandler.Preserve
            };
            options.Converters.Add(new DateTimeConverter());

            optionsWithoutConverter = new JsonSerializerOptions()
            {
                PropertyNamingPolicy = JsonNamingPolicy.CamelCase
            };
            
            NetworkStream stream = client.GetStream();
            writer = new StreamWriter(stream, Encoding.ASCII) {AutoFlush = true};
            reader = new StreamReader(stream, Encoding.ASCII);

        }

        public async Task Start()
        {
            clientConnected = true;
            do
            {
                try
                {
                    var requestType = reader.ReadLine();
                    await ProcessClientRequestType(requestType);
                }
                catch (IOException e)
                {
                    clientConnected = false;
                }
            } while (clientConnected);
            
            client.Close();
        }
        
        private async Task ProcessClientRequestType(string requestType)
        {
            switch (requestType)
            {
                case "getOrders":
                    await GetOrders();
                    break;
                case "createOrder":
                    await CreateOrder();
                    break;
                case "getMenus":
                    await GetMenus();
                    break;
                case "getMenuItems":
                    await GetMenuItems();
                    break;
                case "createOrderItem":
                    await CreateOrderItem();
                    break;
            }
        }

        private async Task GetMenuItems()
        {
            string receivedMenuId = await reader.ReadLineAsync();
            int menuId = Int32.Parse(receivedMenuId);
            string menuItemsJson;
            try
            {
                menuItemsJson = JsonSerializer.Serialize(await daoFactory.MenuItemDao.ReadMenuItemsAsync(menuId), options);
                writer.WriteLine(menuItemsJson);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
            }
            
        }

        private async Task GetOrders()
        {
            string orderJson;
            try
            {
                orderJson = JsonSerializer.Serialize(await daoFactory.OrdersDao.ReadOrdersAsync(), options);
                writer.WriteLine(orderJson);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
            }
        }

        private async Task CreateOrder()
        {
            string requestBody;
            requestBody = reader.ReadLine();
            Order order = JsonSerializer.Deserialize<Order>(requestBody, options);
                await daoFactory.OrdersDao.CreateOrderAsync(order);
                string orderJson = JsonSerializer.Serialize(order,optionsWithoutConverter);
                writer.WriteLine(orderJson);
        }

        private async Task GetMenus()
        {
            string menusJson;
            try
            {
                menusJson = JsonSerializer.Serialize(await daoFactory.MenuDao.GetMenusAsync(), options);
                Console.WriteLine(menusJson);
                writer.WriteLine(menusJson);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
            }
        }
        
        private async Task CreateOrderItem()
        {

            string requestBody;
            requestBody = reader.ReadLine();
            OrderItem orderItem = JsonSerializer.Deserialize<OrderItem>(requestBody, options);
            await daoFactory.OrderItemsDao.CreateOrderItemAsync(orderItem);
            string orderItemJson = JsonSerializer.Serialize(orderItem, options);

            writer.WriteLine(orderItemJson);
        }

    }
}