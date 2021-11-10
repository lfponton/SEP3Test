using System.Threading.Tasks;
using DataServer.Models;
using DataServer.Persistence;

namespace DataServer.DataAccess.Impl
{
    public class MenuItemDao : IMenuItemDao
    {
        private RestaurantDbContext context;

        public MenuItemDao(RestaurantDbContext context)
        {
            this.context = context;
        }

        public async Task CreateMenuItemAsync(MenuItem menuItem)
        {
            await context.MenuItems.AddAsync(menuItem);
            await context.SaveChangesAsync();
        }
    }
}