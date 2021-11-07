package dk.restaurant.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Serializable
{
  private int menuId;
  List<MenuItem> menuItems;
  private double price;
  private String name;
  private String type;

  Menu() {}

  public Menu(int menuId, int price)
  {
    this.menuId = menuId;
    this.menuItems = new ArrayList<>();
    this.price = price;
  }

  public List<MenuItem> getMenuItems()
  {
    return menuItems;
  }

  public void setMenuItems(List<MenuItem> menuItems)
  {
    this.menuItems = menuItems;
  }


  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public int getMenuId()
  {
    return menuId;
  }

  public void setMenuId(int menuId)
  {
    this.menuId = menuId;
  }
}
