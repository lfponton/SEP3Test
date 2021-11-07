using System;

namespace DataServer.Models
{
    public class TableBooking
    {
        public long TableBookingId { get; set; }
        public Table Table { get; set; }
        public Customer Customer { get; set; }
        public DateTime BookingDate { get; set; }
        public int NumberOfGuests { get; set; }
    }
}