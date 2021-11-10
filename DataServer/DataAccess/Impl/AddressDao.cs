using System.Threading.Tasks;
using DataServer.Models;
using DataServer.Persistence;

namespace DataServer.DataAccess.Impl
{
    public class AddressDao : IAddressDao
    {
        private RestaurantDbContext context;

        public AddressDao(RestaurantDbContext context)
        {
            this.context = context;
        }
        public async Task CreateAddressAsync(Address address)
        {
            await context.Addresses.AddAsync(address);
            await context.SaveChangesAsync();
        }
    }
}