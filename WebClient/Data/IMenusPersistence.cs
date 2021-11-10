using System.Collections.Generic;
using System.Threading.Tasks;
using WebClient.Models;

namespace WebClient.Data
{
    public interface IMenusPersistence
    {
        Task<List<Menu>> GetMenus();
        Task CreateMenu(Menu menu);
    }
}