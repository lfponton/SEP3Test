package dk.restaurant.controllers;

import dk.restaurant.models.Order;
import dk.restaurant.models.OrderItem;
import dk.restaurant.network.Client;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.io.IOException;
import java.util.List;

@RestController
public class OrderItemController
{
    private Client client;

    public OrderItemController()
    {
        client = Client.getInstance();
    }

    @GetMapping("/orderItems")
    public List<Order> getOrdersItems() throws IOException
    {
        return client.getOrders();
    }

    @PostMapping("/orderItems")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem)
    {
        System.out.println("Controller");
        return client.createOrderItem(orderItem);
    }
}