package dk.restaurant.models;

public class Address
{
  private int addressId;
  private String city;
  private String streetName;
  private String postNumber;
  private String addressNumber;
  private String door;

  public Address(int addressId, String city, String streetName,
      String postNumber, String addressNumber, String door)
  {
    this.addressId = addressId;
    this.city = city;
    this.streetName = streetName;
    this.postNumber = postNumber;
    this.addressNumber = addressNumber;
    this.door = door;
  }

  public Address() {}

  public int getAddressId()
  {
    return addressId;
  }

  public void setAddressId(int addressId)
  {
    this.addressId = addressId;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getStreetName()
  {
    return streetName;
  }

  public void setStreetName(String streetName)
  {
    this.streetName = streetName;
  }

  public String getPostNumber()
  {
    return postNumber;
  }

  public void setPostNumber(String postNumber)
  {
    this.postNumber = postNumber;
  }

  public String getAddressNumber()
  {
    return addressNumber;
  }

  public void setAddressNumber(String addressNumber)
  {
    this.addressNumber = addressNumber;
  }

  public String getDoor()
  {
    return door;
  }

  public void setDoor(String door)
  {
    this.door = door;
  }
}
