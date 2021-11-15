using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;
using WebClient.Models;

namespace WebClient.Data
{
    public class MenuItemsWebService : IMenuItemsService
    {
        private readonly HttpClient client;
        private JsonSerializerOptions options;

        public MenuItemsWebService()
        {
            client = new HttpClient();
            options = new JsonSerializerOptions()
            {
                PropertyNamingPolicy = JsonNamingPolicy.CamelCase
            };
        }
        
        public async Task<IList<MenuItem>> GetMenuItems(int menuId)
        {
            HttpResponseMessage response = await client.GetAsync($"http://localhost:8080/menuItems/{menuId}");
            if (!response.IsSuccessStatusCode)
                throw new Exception($"Error: {response.StatusCode}, {response.ReasonPhrase}");
            string result = await response.Content.ReadAsStringAsync();
            Console.WriteLine(result);
            List<MenuItem> menus = JsonSerializer.Deserialize<List<MenuItem>>(result, options);
            return menus;
        }
        
    }
}