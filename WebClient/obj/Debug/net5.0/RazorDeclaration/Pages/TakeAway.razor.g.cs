// <auto-generated/>
#pragma warning disable 1591
#pragma warning disable 0414
#pragma warning disable 0649
#pragma warning disable 0169

namespace WebClient.Pages
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Components;
#nullable restore
#line 1 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using System.Net.Http;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using Microsoft.AspNetCore.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using Microsoft.AspNetCore.Components.Authorization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 4 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using Microsoft.AspNetCore.Components.Forms;

#line default
#line hidden
#nullable disable
#nullable restore
#line 5 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using Microsoft.AspNetCore.Components.Routing;

#line default
#line hidden
#nullable disable
#nullable restore
#line 6 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using Microsoft.AspNetCore.Components.Web;

#line default
#line hidden
#nullable disable
#nullable restore
#line 7 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using Microsoft.AspNetCore.Components.Web.Virtualization;

#line default
#line hidden
#nullable disable
#nullable restore
#line 8 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using Microsoft.JSInterop;

#line default
#line hidden
#nullable disable
#nullable restore
#line 9 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using WebClient;

#line default
#line hidden
#nullable disable
#nullable restore
#line 10 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using Radzen;

#line default
#line hidden
#nullable disable
#nullable restore
#line 11 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\_Imports.razor"
using Radzen.Blazor;

#line default
#line hidden
#nullable disable
#nullable restore
#line 2 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\Pages\TakeAway.razor"
using WebClient.Models;

#line default
#line hidden
#nullable disable
#nullable restore
#line 3 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\Pages\TakeAway.razor"
using WebClient.Data;

#line default
#line hidden
#nullable disable
    [Microsoft.AspNetCore.Components.RouteAttribute("/TakeAway")]
    public partial class TakeAway : Microsoft.AspNetCore.Components.ComponentBase
    {
        #pragma warning disable 1998
        protected override void BuildRenderTree(Microsoft.AspNetCore.Components.Rendering.RenderTreeBuilder __builder)
        {
        }
        #pragma warning restore 1998
#nullable restore
#line 56 "C:\Users\agosm\RiderProjects\SEP3c\WebClient\Pages\TakeAway.razor"
       
    private IList<Menu> menus = new List<Menu>();
    int Quantity;
    private Cart cart = new Cart();
    
    protected override async Task OnInitializedAsync()
    {
        menus = await MenusPersistence.GetMenus();
       
    }

    void OnSelectQuantity(dynamic value)
    {
        Quantity = value;
    }

    void OnAddToOrder(int menuId)
    {
        /*Menu menuToAdd = menus.First(m => m.MenuId == menuId);
        cart.MenuSelection.Add(new ShoppingCartItem(Quantity,menuToAdd));
        cart.SetOrderPrice(Quantity, menuToAdd);*/
    }


#line default
#line hidden
#nullable disable
        [global::Microsoft.AspNetCore.Components.InjectAttribute] private IMenusPersistence MenusPersistence { get; set; }
    }
}
#pragma warning restore 1591