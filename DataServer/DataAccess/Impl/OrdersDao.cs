using System.Collections.Generic;
using System.Threading.Tasks;
using DataServer.Models;
using DataServer.Persistence;
using Microsoft.EntityFrameworkCore;

namespace DataServer.DataAccess.Impl
{
    public class OrdersDao : IOrdersDao
    {
        private RestaurantDbContext context;
        public OrdersDao(RestaurantDbContext context)
        {
            this.context = context;
        }
        public async Task CreateOrderAsync(Order order)
        {
            await context.AddAsync(order);
            await context.SaveChangesAsync();
        }

        public async Task<IList<Order>> ReadOrdersAsync()
        {
            return await context.Orders
                .Include(o => o.Menus)
                .Include(o => o.Customer).ToListAsync();
        }

        public async Task UpdateOrderAsync(Order order)
        {
            Order toUpdate = await context.Orders.FirstAsync(o => o.OrderId == order.OrderId);
            toUpdate.Customer = order.Customer;
            toUpdate.Menus = order.Menus;
            toUpdate.Price = order.Price;
            toUpdate.Status = order.Status;
            toUpdate.DeliveryTime = order.DeliveryTime;
            toUpdate.OrderDate = order.OrderDate;
            context.Update(toUpdate);
            await context.SaveChangesAsync();
        }

        // Not sure why orders should be deleted
        public async Task DeleteOrderAsync(Order order)
        {
            Order toRemove = await context.Orders.FirstOrDefaultAsync(o => o.OrderId == order.OrderId);
            if (toRemove != null)
            {
                context.Orders.Remove(toRemove);
                await context.SaveChangesAsync();
            }
        }
    }
}