using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace CarRental.Pages
{
    public class IndexModel : PageModel
    {

        public void OnGet()
        {
            
        }


        public void OnPost()
        {
            var StartDate = Request.Form["StartDate"];
        }

        [DataType(DataType.Date)]
        public DateTime StartDate { get; set; } = DateTime.Today;
        [DataType(DataType.Date)]
        public DateTime EndDate { get; set; } = DateTime.Today;
        

    }
}
