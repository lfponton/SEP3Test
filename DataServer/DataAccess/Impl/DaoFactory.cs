using DataServer.Persistence;

namespace DataServer.DataAccess.Impl
{
    public class DaoFactory : IDaoFactory
    {
        public ICustomerDao CustomerDao { get;}
        public IOrdersDao OrdersDao { get;}
        public IAddressDao AddressDao { get; }
        public IMenuDao MenuDao { get; }
        public IMenuItemDao MenuItemDao { get; }
        public IOrderItemDao OrderItemsDao { get; }

        public DaoFactory(RestaurantDbContext context)
        {
            CustomerDao = new CustomerDao(context);
            OrdersDao = new OrdersDao(context);
            AddressDao = new AddressDao(context);
            MenuDao = new MenuDao(context);
            MenuItemDao = new MenuItemDao(context);
            OrderItemsDao = new OrderItemsDao(context);

        }
        
    }
}