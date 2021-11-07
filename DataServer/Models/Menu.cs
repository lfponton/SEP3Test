using System.Collections.Generic;

namespace DataServer.Models
{
    public class Menu
    {
        public int MenuId { get; set; }
        public string Name { get; set; }
        public string Type { get; set; }
        public decimal Price { get; set; }
        public IList<MenuItem> MenuItems { get; set; }
    }
}