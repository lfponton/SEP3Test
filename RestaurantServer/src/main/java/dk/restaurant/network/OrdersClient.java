package dk.restaurant.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import dk.restaurant.models.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class OrdersClient
{
  final String HOST = "localhost";
  final int PORT = 2001;
  private Socket socket;
  private PrintWriter out;
  private BufferedReader in;
  private Gson gson;
  private Gson gsonFrom;


  public OrdersClient() throws IOException {
    socket = new Socket(HOST, PORT);
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    out = new PrintWriter(socket.getOutputStream(), true);
    gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();
  }

  public synchronized List<Order> getOrders() throws IOException {
    List<Order> orders;
    out.println("getOrders");
    String response = in.readLine();
    orders = gson.fromJson(response, new TypeToken<ArrayList<Order>>() {}.getType());
    return orders;
  }

  public synchronized Order CreateOrder(Order order) throws IOException {
    out.println("createOrder");

    String send = gson.toJson(order);
    out.println(send);
    String response = in.readLine();
    System.out.println("hola bug----------->" + response);
    return gson.fromJson(response,Order.class);
  }
}
