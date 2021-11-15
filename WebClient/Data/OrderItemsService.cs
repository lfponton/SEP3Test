using System;
using System.Net.Http;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;
using WebClient.Models;

namespace WebClient.Data
{
    public class OrderItemsService : IOrderItemsService
    {
        private readonly HttpClient client;
        private JsonSerializerOptions options;
        private string uri = "http://localhost:8080";


        public OrderItemsService()
        {
            client = new HttpClient();
            options = new JsonSerializerOptions()
            {
                PropertyNamingPolicy = JsonNamingPolicy.CamelCase
            };
        }
        
        public async Task CreateOrderItem(int quantity, int menuId)
        {
            var orderItem = new OrderItem()
            {  
                OrderId = 1,
                Quantity = quantity,
                MenuId = menuId
            };
            
            string orderItemAsJson = JsonSerializer.Serialize(orderItem);
            HttpContent content = new StringContent(orderItemAsJson, Encoding.UTF8, "application/json");
            HttpResponseMessage response = await client.PostAsync(uri + "/orderItems", content);
            if (!response.IsSuccessStatusCode)
            {
                throw new Exception($"Error,{response.StatusCode},{response.ReasonPhrase}");
            }
        }
    }
}