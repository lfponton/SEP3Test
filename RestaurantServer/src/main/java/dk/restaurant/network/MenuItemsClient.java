package dk.restaurant.network;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dk.restaurant.models.Menu;
import dk.restaurant.models.MenuItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MenuItemsClient
{
  final String HOST = "localhost";
  final int PORT = 2001;
  private Socket socket;
  private PrintWriter out;
  private BufferedReader in;
  private Gson gson;

  public MenuItemsClient() throws IOException
  {
    socket = new Socket(HOST, PORT);
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    out = new PrintWriter(socket.getOutputStream(), true);
    gson = new Gson();

  }


  public List<MenuItem> getMenuItems(int menuId) throws IOException {
    List<MenuItem> menuItems;
    out.println("getMenuItems");
    out.println(menuId);
    String response = in.readLine();
    menuItems = gson.fromJson(response, new TypeToken<ArrayList<MenuItem>>() {}.getType());
    return menuItems;
  }

}
