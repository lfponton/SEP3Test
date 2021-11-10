using System.Collections.Generic;

namespace WebClient.Models
{
    public class Menu
    {
        public int MenuId { get; set; }
        public string Name { get; set; }
        public string Type { get; set; }
        public decimal Price { get; set; }
        public IList<MenuItemsSelection> MenuItemsSelections { get; set; }
    }
}