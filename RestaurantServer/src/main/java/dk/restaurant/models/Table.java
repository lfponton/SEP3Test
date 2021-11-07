package dk.restaurant.models;

public class Table
{
  private int tableId;
  private int capacity;
  private boolean isBooked;

  public Table(int tableId, int capacity, boolean isBooked)
  {
    this.tableId = tableId;
    this.capacity = capacity;
    this.isBooked = isBooked;
  }

  public Table() {}

  public int getTableId()
  {
    return tableId;
  }

  public void setTableId(int tableId)
  {
    this.tableId = tableId;
  }

  public int getCapacity()
  {
    return capacity;
  }

  public void setCapacity(int capacity)
  {
    this.capacity = capacity;
  }

  public boolean isBooked()
  {
    return isBooked;
  }

  public void setBooked(boolean booked)
  {
    isBooked = booked;
  }
}
