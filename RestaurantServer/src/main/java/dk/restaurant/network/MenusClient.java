package dk.restaurant.network;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dk.restaurant.models.Menu;
import dk.restaurant.models.Order;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MenusClient {

    final String HOST = "localhost";
    final int PORT = 2001;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private Gson gson;


       public MenusClient() throws IOException {
           socket = new Socket(HOST, PORT);
           in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           out = new PrintWriter(socket.getOutputStream(), true);
           gson = new Gson();

       }


    public List<Menu> GetMenus() throws IOException {
        List<Menu> menus;
        out.println("getMenus");
        String response = in.readLine();
        menus = gson.fromJson(response, new TypeToken<ArrayList<Order>>() {}.getType());
        return menus;
    }

    public synchronized void CreateMenu(Menu menu) throws IOException {
        out.println("createMenu");
        String send = gson.toJson(menu);
        out.println(send);
        String response = in.readLine();
       // return gson.fromJson(response, Menu.class);

    }
}
