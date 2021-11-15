using System.Threading.Tasks;
using WebClient.Models;

namespace WebClient.Data
{
    public interface IOrderItemsService
    {
        Task CreateOrderItem(int quantity, int menuId);

    }
}