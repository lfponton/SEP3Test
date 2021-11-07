namespace DataServer.DataAccess
{
    public interface IDaoFactory
    {
        ICustomerDao CustomerDao { get; }
        IOrdersDao OrdersDao { get; }
    }
}