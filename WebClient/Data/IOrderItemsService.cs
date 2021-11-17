using System.Collections.Generic;
using System.Threading.Tasks;
using WebClient.Models;

namespace WebClient.Data
{
    public interface IOrderItemsService
    {
        Task CreateOrderItem(int quantity, int menuId, long orderId);
        Task<List<OrderItem>> GetOrderItems(long orderId);

        Task DeleteOrderItem(long orderItemId);
    }
}