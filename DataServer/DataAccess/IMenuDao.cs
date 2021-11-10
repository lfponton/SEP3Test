using System.Threading.Tasks;
using DataServer.Models;

namespace DataServer.DataAccess
{
    public interface IMenuDao
    {
        Task CreateMenuAsync(Menu menu);
    }
}