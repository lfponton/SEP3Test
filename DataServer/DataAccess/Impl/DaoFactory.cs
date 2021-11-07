using DataServer.Persistence;

namespace DataServer.DataAccess.Impl
{
    public class DaoFactory : IDaoFactory
    {
        public ICustomerDao CustomerDao { get;}
        public IOrdersDao OrdersDao { get;}
        
        public DaoFactory(RestaurantDbContext context)
        {
            CustomerDao = new CustomerDao(context);
            OrdersDao = new OrdersDao(context);
        }
        
    }
}