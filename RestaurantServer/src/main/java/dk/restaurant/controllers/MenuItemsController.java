
package dk.restaurant.controllers;

import dk.restaurant.models.MenuItem;
import dk.restaurant.network.Client;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@RestController
public class MenuItemsController {
  private Client client;

  public MenuItemsController()
  {
    client = Client.getInstance();
  }

  @GetMapping("/menuItems/{menuId}")
  public List<MenuItem> GetMenuItems(@PathVariable int menuId) throws IOException
  {
    return client.getMenusItems(menuId);
  }
}