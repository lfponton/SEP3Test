using System.Collections.Generic;
using System.Threading.Tasks;
using DataServer.Models;

namespace DataServer.DataAccess
{
    public interface IMenuItemDao
    {
        Task CreateMenuItemAsync(MenuItem menuItem);

        Task<List<MenuItem>> ReadMenuItemsAsync(int menuId);
    }
}