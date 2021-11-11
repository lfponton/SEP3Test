using System.Collections.Generic;
using System.Threading.Tasks;
using WebClient.Models;

namespace WebClient.Data
{
    public interface IMenuItemsService
    {
        Task<IList<MenuItem>> GetMenuItems(int menuId);
    }
}