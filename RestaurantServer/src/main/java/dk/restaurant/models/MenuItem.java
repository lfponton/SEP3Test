package dk.restaurant.models;

import java.util.ArrayList;
import java.util.List;

public class MenuItem
{
  private int menuItemId;
  private String name;
  private String description;
  private double price;
  private List<Menu> menus;

  public MenuItem(int menuItemId, String name, String description, double price, List<Menu> menus)
  {
    this.menuItemId = menuItemId;
    this.name = name;
    this.description = description;
    this.price = price;
    this.menus = menus;
  }

  public MenuItem() {}

  public int getMenuItemId()
  {
    return menuItemId;
  }

  public void setMenuItemId(int menuItemId)
  {
    this.menuItemId = menuItemId;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public List<Menu> getMenus()
  {
    return menus;
  }

  public void setMenus(List<Menu> menus)
  {
    this.menus = menus;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }
}
