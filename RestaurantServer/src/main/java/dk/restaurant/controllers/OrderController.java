package dk.restaurant.controllers;

import dk.restaurant.models.Order;
import dk.restaurant.network.Client;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class OrderController
{
  private Client client;

  public OrderController()
  {
    client = Client.getInstance();
  }

  @GetMapping("/orders")
  public List<Order> getOrders() throws IOException
  {
    return client.getOrders();
  }

  @PostMapping("/orders")
  @ResponseStatus(HttpStatus.CREATED)
  public Order createOrder(@RequestBody Order order)
  {
    return client.createOrder(order);


  }
}