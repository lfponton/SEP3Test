package dk.restaurant.models;

import java.io.Serializable;

public class Customer implements Serializable
{
  private long customerId;
  public String email;
  private String firstName;
  private String lastName;
  private Address address;

  Customer() {}

  public Customer(long customerId, String email, String firstName, String lastName,
      Address address)
  {
    this.customerId = customerId;
    this.email = email;
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

  public Address getAddress()
  {
    return address;
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }
}
