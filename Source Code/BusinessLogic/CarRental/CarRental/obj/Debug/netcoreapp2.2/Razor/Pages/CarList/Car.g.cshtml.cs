#pragma checksum "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "cd414d98702681f073a17ce53829a66425934b5b"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(CarRental.Pages.CarList.Pages_CarList_Car), @"mvc.1.0.razor-page", @"/Pages/CarList/Car.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.RazorPages.Infrastructure.RazorPageAttribute(@"/Pages/CarList/Car.cshtml", typeof(CarRental.Pages.CarList.Pages_CarList_Car), null)]
namespace CarRental.Pages.CarList
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#line 1 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\_ViewImports.cshtml"
using CarRental;

#line default
#line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"cd414d98702681f073a17ce53829a66425934b5b", @"/Pages/CarList/Car.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"79ca2b1a8515e8e6186053a59f45845126feb776", @"/Pages/_ViewImports.cshtml")]
    public class Pages_CarList_Car : global::Microsoft.AspNetCore.Mvc.RazorPages.Page
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
#line 3 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
  
    ViewData["Title"] = "Car";

#line default
#line hidden
            BeginContext(87, 50, true);
            WriteLiteral("\r\n<h1>Car list offered for selected days:</h1>\r\n\r\n");
            EndContext();
#line 9 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
 if(Model.Cars.Count()>0)
{

#line default
#line hidden
            BeginContext(167, 136, true);
            WriteLiteral("    <br/><br/>\r\n    <table class=\"table table-striped border\">\r\n        <tr class=\"table-secondary\">\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(304, 68, false);
#line 15 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().registrationNumber));

#line default
#line hidden
            EndContext();
            BeginContext(372, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(428, 58, false);
#line 18 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().carModel));

#line default
#line hidden
            EndContext();
            BeginContext(486, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(542, 58, false);
#line 21 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().carBrand));

#line default
#line hidden
            EndContext();
            BeginContext(600, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(656, 66, false);
#line 24 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().dateOfProduction));

#line default
#line hidden
            EndContext();
            BeginContext(722, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(778, 61, false);
#line 27 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().gearboxType));

#line default
#line hidden
            EndContext();
            BeginContext(839, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(895, 63, false);
#line 30 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().numberOfDoors));

#line default
#line hidden
            EndContext();
            BeginContext(958, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(1014, 64, false);
#line 33 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().engineCapacity));

#line default
#line hidden
            EndContext();
            BeginContext(1078, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(1134, 58, false);
#line 36 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().fuelType));

#line default
#line hidden
            EndContext();
            BeginContext(1192, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(1248, 58, false);
#line 39 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().carColor));

#line default
#line hidden
            EndContext();
            BeginContext(1306, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(1362, 64, false);
#line 42 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().carDescription));

#line default
#line hidden
            EndContext();
            BeginContext(1426, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(1482, 58, false);
#line 45 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().carPrice));

#line default
#line hidden
            EndContext();
            BeginContext(1540, 55, true);
            WriteLiteral("\r\n            </th>\r\n            <th>\r\n                ");
            EndContext();
            BeginContext(1596, 60, false);
#line 48 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayNameFor(m => m.Cars.FirstOrDefault().carDeposit));

#line default
#line hidden
            EndContext();
            BeginContext(1656, 36, true);
            WriteLiteral("\r\n            </th>\r\n        </tr>\r\n");
            EndContext();
#line 51 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
         foreach(var item in Model.Cars)
        {

#line default
#line hidden
            BeginContext(1745, 48, true);
            WriteLiteral("        <tr>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(1794, 45, false);
#line 55 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.registrationNumber));

#line default
#line hidden
            EndContext();
            BeginContext(1839, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(1895, 35, false);
#line 58 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.carModel));

#line default
#line hidden
            EndContext();
            BeginContext(1930, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(1986, 35, false);
#line 61 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.carBrand));

#line default
#line hidden
            EndContext();
            BeginContext(2021, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(2077, 43, false);
#line 64 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.dateOfProduction));

#line default
#line hidden
            EndContext();
            BeginContext(2120, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(2176, 38, false);
#line 67 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.gearboxType));

#line default
#line hidden
            EndContext();
            BeginContext(2214, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(2270, 40, false);
#line 70 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.numberOfDoors));

#line default
#line hidden
            EndContext();
            BeginContext(2310, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(2366, 41, false);
#line 73 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.engineCapacity));

#line default
#line hidden
            EndContext();
            BeginContext(2407, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(2463, 35, false);
#line 76 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.fuelType));

#line default
#line hidden
            EndContext();
            BeginContext(2498, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(2554, 35, false);
#line 79 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.carColor));

#line default
#line hidden
            EndContext();
            BeginContext(2589, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(2645, 41, false);
#line 82 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.carDescription));

#line default
#line hidden
            EndContext();
            BeginContext(2686, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(2742, 35, false);
#line 85 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.carPrice));

#line default
#line hidden
            EndContext();
            BeginContext(2777, 55, true);
            WriteLiteral("\r\n            </td>\r\n            <td>\r\n                ");
            EndContext();
            BeginContext(2833, 37, false);
#line 88 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
           Write(Html.DisplayFor(m => item.carDeposit));

#line default
#line hidden
            EndContext();
            BeginContext(2870, 36, true);
            WriteLiteral("\r\n            </td>\r\n        </tr>\r\n");
            EndContext();
#line 91 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
        }

#line default
#line hidden
            BeginContext(2917, 14, true);
            WriteLiteral("    </table>\r\n");
            EndContext();
#line 93 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
}
else
{

#line default
#line hidden
            BeginContext(2943, 48, true);
            WriteLiteral("    <p>\r\n        No books available;\r\n    </p>\r\n");
            EndContext();
#line 99 "C:\Users\DUNAI\Documents\GitHub\CarRental\Source Code\BusinessLogic\CarRental\CarRental\Pages\CarList\Car.cshtml"
}

#line default
#line hidden
            BeginContext(2994, 2, true);
            WriteLiteral("\r\n");
            EndContext();
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<CarRental.Pages.CarList.CarModel> Html { get; private set; }
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.ViewDataDictionary<CarRental.Pages.CarList.CarModel> ViewData => (global::Microsoft.AspNetCore.Mvc.ViewFeatures.ViewDataDictionary<CarRental.Pages.CarList.CarModel>)PageContext?.ViewData;
        public CarRental.Pages.CarList.CarModel Model => ViewData.Model;
    }
}
#pragma warning restore 1591
