using System;
using System.Collections.Generic;

namespace DataServer.Models
{
    public class Order
    {
        public long OrderId { get; set; }
        public DateTime OrderDate { get; set; }
        public DateTime DeliveryTime { get; set; }
        public decimal Price { get; set; }
        public IList<Menu> Menus { get; set; }
        public Customer Customer { get; set; }
        public Status Status { get; set; }

    }
}