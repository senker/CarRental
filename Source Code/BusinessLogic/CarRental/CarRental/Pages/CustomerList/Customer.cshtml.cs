using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using CarRental.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace CarRental.Pages.CarList
{
    public class CustomerModel : PageModel
    {

        private readonly ApplicationDbContext _db;

        public CustomerModel(ApplicationDbContext db)
        {
            _db = db;
        }

        [BindProperty]
        public Customer Customer { get; set; }
        [BindProperty]
        public Car car { get; set; }

        public void OnGet(string registrationNumber)
        {
            car = _db.Car.Find(registrationNumber);  
        }
        
        public async Task<IActionResult> OnPost()
        {
            if (!ModelState.IsValid)
            {
                return Page();
            }
            _db.Customer.Add(Customer);
            await _db.SaveChangesAsync();
            return RedirectToPage("Car");
        }
    }
}