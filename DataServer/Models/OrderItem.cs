using DataServer.Models;

namespace DatabaseServer.Models
{
    public class OrderItem
    {
        public long OrderItemId { get; set; }
        public long OrderId { get; set; }
        public Menu Menu { get; set; }
        public int Quantity { get; set; }
    }
}