package dk.restaurant.models;

public class OrderItem {

    public long orderItemId;
    public long orderId;
    public long menuId;
    public int quantity;
  //  public double Price;
//For testing
    public long getOrderItemId() {
        return orderItemId;
    }

    public long getOrderId() {
        return orderId;
    }

    public long getMenuId() {
        return menuId;
    }

    public int getQuantity() {
        return quantity;
    }
}
