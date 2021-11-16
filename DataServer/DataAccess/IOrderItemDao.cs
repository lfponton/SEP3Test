using System.Collections.Generic;
using System.Threading.Tasks;
using DataServer.Models;
using DataServer.Models;

namespace DataServer.DataAccess
{
    public interface IOrderItemDao
    {
        Task<OrderItem> CreateOrderItemAsync(OrderItem orderItem);

        Task<List<OrderItem>> GetOrderItemsAsync(int orderId);
    }
}