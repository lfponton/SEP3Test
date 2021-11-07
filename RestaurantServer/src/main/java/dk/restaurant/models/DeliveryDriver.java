package dk.restaurant.models;

public class DeliveryDriver
{
  private int deliveryDriverId;
  private String Email;
  private String FirstName;
  private String LastName;
  private String Password;

  public DeliveryDriver(int deliveryDriverId, String email, String firstName,
      String lastName, String password)
  {
    this.deliveryDriverId = deliveryDriverId;
    Email = email;
    FirstName = firstName;
    LastName = lastName;
    Password = password;
  }

  public DeliveryDriver() {}

  public int getDeliveryDriverId()
  {
    return deliveryDriverId;
  }

  public void setDeliveryDriverId(int deliveryDriverId)
  {
    this.deliveryDriverId = deliveryDriverId;
  }

  public String getEmail()
  {
    return Email;
  }

  public void setEmail(String email)
  {
    Email = email;
  }

  public String getFirstName()
  {
    return FirstName;
  }

  public void setFirstName(String firstName)
  {
    FirstName = firstName;
  }

  public String getLastName()
  {
    return LastName;
  }

  public void setLastName(String lastName)
  {
    LastName = lastName;
  }

  public String getPassword()
  {
    return Password;
  }

  public void setPassword(String password)
  {
    Password = password;
  }
}
