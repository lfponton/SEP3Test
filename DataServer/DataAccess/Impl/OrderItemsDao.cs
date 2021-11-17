using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using DataServer.Models;
using DataServer.Persistence;
using Microsoft.EntityFrameworkCore;

namespace DataServer.DataAccess.Impl
{
    public class OrderItemsDao : IOrderItemDao
    {
        private RestaurantDbContext context;
        public OrderItemsDao(RestaurantDbContext context)
        {
            this.context = context;
        }
        
        
        public async Task<OrderItem>CreateOrderItemAsync(OrderItem orderItem)
        {
            await context.OrderItems.AddAsync(orderItem);
            await context.SaveChangesAsync();
            return orderItem;
        }

        public async Task<List<OrderItem>> GetOrderItemsAsync(int orderId)
        {
            return await context.OrderItems.Where(o => o.OrderId == orderId).ToListAsync();

        }

        public async Task DeleteOrderItemAsync(long orderItemId)
        {
            OrderItem toRemove = await context.OrderItems.FirstOrDefaultAsync(o => o.OrderItemId == orderItemId);
            if (toRemove != null)
            {
                context.OrderItems.Remove(toRemove);
                await context.SaveChangesAsync();
            }
        }
    }
}