package dk.restaurant.models;

import java.io.Serializable;

public class Order implements Serializable
{
  private long orderId;
  private String description;
  private String status;
  private dk.restaurant.models.Customer customer;
  private Menu menu;
  private int price;

  Order() {}

  public Order(long orderId, String description, String status, Customer customer, Menu menu,
      int price)
  {
    this.orderId = orderId;
    this.description = description;
    this.status = status;
    this.customer = customer;
    this.menu = menu;
    this.price = price;
  }

  public long getOrderId()
  {
    return orderId;
  }

  public void setOrderId(long orderId)
  {
    this.orderId = orderId;
  }

  public int getPrice()
  {
    return price;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

  public Customer getCustomer()
  {
    return customer;
  }

  public void setCustomer(Customer customer)
  {
    this.customer = customer;
  }

  public Menu getMenu()
  {
    return menu;
  }

  public void setMenu(Menu menu)
  {
    this.menu = menu;
  }

  public String getDescription() {
    return this.description;
  }

  public String getStatus() {
    return this.status;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override public String toString()
  {
    return "Order{" + "order_id=" + orderId + ", description='" + description
        + ", status=" + status + ", customer=" + customer.getCustomerId() + ", menu="
        + menu.getMenuId() + ", price=" + price + '}';
  }
}