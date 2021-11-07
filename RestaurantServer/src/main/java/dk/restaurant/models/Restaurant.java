package dk.restaurant.models;

import java.util.List;

public class Restaurant
{
  private long restaurantId;
  private String name;
  private List<Table> tables;
  private List<StaffMember> staff;
  private List<DeliveryDriver> deliveryDrivers;
  private Address address;

  public Restaurant(long restaurantId, String name, List<Table> tables,
      List<StaffMember> staff, List<DeliveryDriver> deliveryDrivers,
      Address address)
  {
    this.restaurantId = restaurantId;
    this.name = name;
    this.tables = tables;
    this.staff = staff;
    this.deliveryDrivers = deliveryDrivers;
    this.address = address;
  }

  public Restaurant() {}

  public long getRestaurantId()
  {
    return restaurantId;
  }

  public void setRestaurantId(long restaurantId)
  {
    this.restaurantId = restaurantId;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public List<Table> getTables()
  {
    return tables;
  }

  public void setTables(List<Table> tables)
  {
    this.tables = tables;
  }

  public List<StaffMember> getStaff()
  {
    return staff;
  }

  public void setStaff(List<StaffMember> staff)
  {
    this.staff = staff;
  }

  public List<DeliveryDriver> getDeliveryDrivers()
  {
    return deliveryDrivers;
  }

  public void setDeliveryDrivers(List<DeliveryDriver> deliveryDrivers)
  {
    this.deliveryDrivers = deliveryDrivers;
  }

  public Address getAddress()
  {
    return address;
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }
}
