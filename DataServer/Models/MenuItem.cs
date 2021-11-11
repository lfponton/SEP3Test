using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace DataServer.Models
{
    public class MenuItem
    {
        public int MenuItemId { get; set; }
        public string Name { get; set; }
        public string Description { get; set; }
        public decimal Price { get; set; }
        
        public IList<Menu> Menus { get; set; }
    }
}