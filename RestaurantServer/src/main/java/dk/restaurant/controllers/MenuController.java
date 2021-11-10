package dk.restaurant.controllers;

import dk.restaurant.models.Menu;
import dk.restaurant.network.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class MenuController {
    private Client client;

    public MenuController()
    {
        client = Client.getInstance();
    }

    @GetMapping("/menus")
    public List<Menu> GetMenus() throws IOException
    {
        return client.GetMenus();
    }
}
