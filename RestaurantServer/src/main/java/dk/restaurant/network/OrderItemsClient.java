package dk.restaurant.network;

import com.google.gson.Gson;
import dk.restaurant.models.Order;
import dk.restaurant.models.OrderItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class OrderItemsClient {
    final String HOST = "localhost";
    final int PORT = 2001;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private Gson gson;


    public OrderItemsClient() throws IOException {
        socket = new Socket(HOST, PORT);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
        gson = new Gson();

    }

    public synchronized OrderItem CreateOrderItem(OrderItem orderItem) throws IOException {
        System.out.println("Specific client");
        out.println("createOrderItem");
        String send = gson.toJson(orderItem);
        out.println(send);
        String response = in.readLine();
        System.out.println(response);
        return gson.fromJson(response, OrderItem.class);
    }
}
