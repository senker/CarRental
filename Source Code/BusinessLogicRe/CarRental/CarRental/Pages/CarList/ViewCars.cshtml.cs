using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using CarRental.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;

namespace CarRental.Pages.CarList
{
    public class ViewCarsModel : PageModel
    {
        private readonly ApplicationDbContext _db;

        public ViewCarsModel(ApplicationDbContext db)
        {
            _db = db;
        }

        public IEnumerable<Car> Cars { get; set; }
        


        public async Task OnGet()
        {
            Cars = await _db.Car.ToListAsync();

        }
    }
}