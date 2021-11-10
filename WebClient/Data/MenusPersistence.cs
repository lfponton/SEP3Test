using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;
using WebClient.Models;

namespace WebClient.Data
{
    public class MenusPersistence : IMenusPersistence
    {
        private readonly HttpClient client;
        private JsonSerializerOptions options;

        public MenusPersistence()
        {
            client = new HttpClient();
            options = new JsonSerializerOptions()
            {
                PropertyNamingPolicy = JsonNamingPolicy.CamelCase
            };
        }
        
        public async Task<List<Menu>> GetMenus()
        {
            HttpResponseMessage response = await client.GetAsync($"http://localhost:8080/menus");
            if (!response.IsSuccessStatusCode)
                throw new Exception($"Error: {response.StatusCode}, {response.ReasonPhrase}");
            string result = await response.Content.ReadAsStringAsync();
            List<Menu> menus = JsonSerializer.Deserialize<List<Menu>>(result, options);
            return menus;
        }

        public async Task CreateMenu(Menu menu)
        {
            throw new System.NotImplementedException();
        }
    }
}