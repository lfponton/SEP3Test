using System.Collections.Generic;

namespace DataServer.Models
{
    public class Restaurant
    {
        public long RestaurantId { get; set; }
        public string Name { get; set; }
        public IList<Table> Tables { get; set; }
        public IList<StaffMember> Staff { get; set; }
        public IList<DeliveryDriver> DeliveryDrivers { get; set; }
        public Address Address { get; set; }
    }
}