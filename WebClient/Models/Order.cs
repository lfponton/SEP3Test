using System;
using System.Collections.Generic;

namespace WebClient.Models
{
    public class Order
    {
        public long OrderId { get; set; }
        public DateTime OrderDate { get; set; }
        public DateTime DeliveryTime { get; set; }
        public decimal Price { get; set; }
        public IList<OrderItem> OrderItems { get; set; } = new List<OrderItem>();
        public Customer Customer { get; set; }
        public string Status { get; set; }
        
        public Address DeliveryAddress{ get; set; }

       
    }
}