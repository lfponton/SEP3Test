package dk.restaurant.network;

import dk.restaurant.models.Order;

import java.io.IOException;
import java.util.List;

public class Client
{
  private static volatile Client instance;
  private final static Object lock = new Object();

  private OrdersClient ordersClient;
  // Could include a cache

  private Client() throws IOException
  {
    ordersClient = new OrdersClient();
  }

  public static Client getInstance()
  {
    if (instance == null)
    {
      synchronized (lock)
      {
        if (instance == null)
        {
          try
          {
            instance = new Client();
          }
          catch (IOException e)
          {
            e.printStackTrace();
          }
        }
      }
    }
    return instance;
  }

  public List<Order> getOrders() throws IOException
  {
    return ordersClient.getOrders();
  }

  public Order createOrder(Order order) {
    try {
      order = ordersClient.CreateOrder(order);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    return order;
  }
}