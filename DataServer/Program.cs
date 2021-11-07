using System;
using System.Net;
using System.Threading;
using DataServer.DataAccess;
using DataServer.DataAccess.Impl;
using DataServer.Network;
using DataServer.Persistence;

namespace DataServer
{
    class Program
    {
        static void Main(string[] args)
        {
            RestaurantDbContext restaurantDbContext = new RestaurantDbContext();
            IDaoFactory daoFactory = new DaoFactory(restaurantDbContext);

            Server server = new Server(IPAddress.Parse("127.0.0.1"), 2001, daoFactory);
            var serverThread = new Thread(server.Listen);
            serverThread.Start();
            Console.WriteLine($"Server started.");
        }
    }
}