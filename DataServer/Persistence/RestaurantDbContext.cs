﻿using DatabaseServer.Models;
using DataServer.Models;
using Microsoft.EntityFrameworkCore;

namespace DataServer.Persistence
{
    public class RestaurantDbContext : DbContext
    {
        public DbSet<Address> Addresses { get; set; }
        public DbSet<Customer> Customers { get; set; }
        public DbSet<DeliveryDriver> DeliveryDrivers { get; set; }
        public DbSet<Menu> Menus { get; set; }
        public DbSet<MenuItemsSelection> MenuItemsSelections { get; set; }
        public DbSet<MenuItem> MenuItems { get; set; }
        public DbSet<Order> Orders { get; set; }
        public DbSet<OrderItem> OrderItems { get; set; }
        public DbSet<StaffMember> StaffMembers { get; set; }
        public DbSet<Table> Tables { get; set; }
        public DbSet<TableBooking> TableBookings { get; set; }
        
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlite(@"Data Source = C:/Users/lfpon/RiderProjects/RestaurantApp/DataServer/RestaurantDB.db");
        }


    }
}