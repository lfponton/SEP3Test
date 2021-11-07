package dk.restaurant.models;

public class StaffMember
{
  private int staffMemberId;
  private String email;
  private String firstName;
  private String lastName;
  private String password;

  public StaffMember(int staffMemberId, String email, String firstName,
      String lastName, String password)
  {
    this.staffMemberId = staffMemberId;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
  }

  public StaffMember() {}

  public int getStaffMemberId()
  {
    return staffMemberId;
  }

  public void setStaffMemberId(int staffMemberId)
  {
    this.staffMemberId = staffMemberId;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
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

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }
}
