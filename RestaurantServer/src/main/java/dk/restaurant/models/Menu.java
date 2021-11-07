package dk.restaurant.models;

import java.io.Serializable;

public class Menu implements Serializable
{
  private long menuId;
  //List<MenuItem> menuItems;
  private int price;

  Menu() {}

  public Menu(long menuId, int price)
  {
    this.menuId = menuId;
    //this.menuItems = new ArrayList<>();
    this.price = price;
  }
/*
  public List<MenuItem> getMenuItems()
  {
    return menuItems;
  }

  public void setMenuItems(List<MenuItem> menuItems)
  {
    this.menuItems = menuItems;
  }

 */

  public int getPrice()
  {
    return price;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

  public Long getMenuId()
  {
    return menuId;
  }

  public void setMenuId(Long menuId)
  {
    this.menuId = menuId;
  }
}
