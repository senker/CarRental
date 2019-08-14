using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using CarRental.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;

namespace CarRental.Pages.Requests
{
    public class CreateRequestModel : PageModel
    {
        private readonly ApplicationDbContext _db;

        public CreateRequestModel(ApplicationDbContext db)
        {
            _db = db;
        }

        public async Task OnGet(string Id)
        {
            Car = _db.Car.Find(Id);
        }

        [BindProperty]
        public Customer Customer { get; set; }
        [BindProperty]
        public Car Car { get; set; }

        public async Task<IActionResult> OnPost()
        {
            if (!ModelState.IsValid)
            {
                return Page();
            }
            var CarFromDb = await _db.Car.FindAsync(Car.registrationNumber);

            CarFromDb.carModel = Car.carModel;
            CarFromDb.carBrand = Car.carBrand;
            CarFromDb.yearOfProduction = Car.yearOfProduction;
            CarFromDb.gearboxType = Car.gearboxType;
            CarFromDb.numberOfDoors = Car.numberOfDoors;
            CarFromDb.engineCapacity = Car.engineCapacity;
            CarFromDb.fuelType = Car.fuelType;
            CarFromDb.carColor = Car.carColor;
            CarFromDb.carDescription = Car.carDescription;
            CarFromDb.carPrice = Car.carPrice;
            CarFromDb.carDeposit = Car.carDeposit;
            Customer.requestedCar = Car.registrationNumber;
            _db.Customer.Add(Customer);

            await _db.SaveChangesAsync();
            return RedirectToPage("../CarList/ViewCars");
        }
    }
}