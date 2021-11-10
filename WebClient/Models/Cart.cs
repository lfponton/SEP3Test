using System.Collections.Generic;

namespace WebClient.Models
{
    public class Cart
    {
        //this class is meant to be a cache for the previous order before the customer logs in
        //We can discuss how to do it in another way
        
        public List<OrderItem> OrderItemList { get; set; }
        public Order CacheOrder { get; set; }
        
        
    }
}