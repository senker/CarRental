using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;
using CarRental.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;

namespace CarRental.Pages.CarList
{
    public class CarModel : PageModel
    {
        private readonly ApplicationDbContext _db;

        [BindProperty]
        [DataType(DataType.Date)]
        public IndexModel StartDate { get; set; }

        

        public CarModel(ApplicationDbContext db)
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