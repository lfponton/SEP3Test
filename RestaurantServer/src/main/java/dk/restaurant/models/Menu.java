package dk.restaurant.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Serializable
{
  private int menuId;
  List<MenuItem> menuItemsSelections;
  private double price;
  private String name;
  private String type;

  Menu() {}

  public Menu(int menuId, int price, String name,String type)
  {
    this.menuId = menuId;
    this.menuItemsSelections = new ArrayList<>();
    this.price = price;
    this.name = name;
    this.type = type;
  }

  public List<MenuItem> getMenuItems()
  {
    return menuItemsSelections;
  }

  public void setMenuItems(List<MenuItem> menuItems)
  {
    this.menuItemsSelections = menuItems;
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

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }
}
