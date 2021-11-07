package dk.restaurant.models;

public class MenuItem
{
  private int menuItemId;
  private String name;
  private String description;
  private double price;

  public MenuItem(int menuItemId, String name, String description, double price)
  {
    this.menuItemId = menuItemId;
    this.name = name;
    this.description = description;
    this.price = price;
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

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }
}
