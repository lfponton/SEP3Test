package dk.restaurant.models;

import java.io.Serializable;

public class Customer implements Serializable
{
  private long customerId;
  private String firstName;
  private String lastName;
  private String address;

  Customer() {}

  public Customer(long customerId, String firstName, String lastName,
      String address)
  {
    this.customerId = customerId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
  }

  public long getCustomerId()
  {
    return customerId;
  }

  public void setCustomerId(long customerId)
  {
    this.customerId = customerId;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }
}
