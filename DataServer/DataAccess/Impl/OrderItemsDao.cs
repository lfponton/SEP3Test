using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using DatabaseServer.Models;
using DataServer.Persistence;

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

        public Task<List<OrderItem>> GetOrderItemsAsync(int orderId)
        {
            throw new System.NotImplementedException();
        }
    }
}