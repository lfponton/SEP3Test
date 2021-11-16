package dk.restaurant.network;

import dk.restaurant.models.Menu;
import dk.restaurant.models.MenuItem;
import dk.restaurant.models.Order;
import dk.restaurant.models.OrderItem;

import java.io.IOException;
import java.util.List;

public class Client
{
  private static volatile Client instance;
  private final static Object lock = new Object();

  private OrdersClient ordersClient;
  private MenusClient menusClient;
  private MenuItemsClient menuItemsClient;
  private OrderItemsClient orderItemsClient;
  // Could include a cache

  private Client() throws IOException
  {
    ordersClient = new OrdersClient();
    menusClient = new MenusClient();
    menuItemsClient = new MenuItemsClient();
    orderItemsClient = new OrderItemsClient();
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

  public List<Menu> getMenus() throws IOException
  {
    return  menusClient.GetMenus();
  }

  public List<MenuItem> getMenusItems(int menuId) throws IOException
  {
    return menuItemsClient.getMenuItems(menuId);
  }

   public OrderItem createOrderItem(OrderItem orderItem) {
    try {
      System.out.println("Client->>> "+"OrderId: "+ orderItem.getOrderId() +"MEnuId"+ orderItem.getMenuId() +"Quantity"+ orderItem.getQuantity());
      orderItem = orderItemsClient.CreateOrderItem(orderItem);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    return orderItem;
  }
}