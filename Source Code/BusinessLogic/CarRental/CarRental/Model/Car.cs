using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;
using System.Collections;

namespace CarRental.Model
{
    public class Car
    {
        [Key]
        [Required]
        [Display(Name = "Car Registration Number")]
        public string registrationNumber { get; set; }
        [Required]
        [Display(Name = "Car Model")]
        public string carModel { get; set; }
        [Required]
        [Display(Name = "Car Brand")]
        public string carBrand { get; set; }
        [Required]
        [Display(Name = "Production Date")]
        public DateTime dateOfProduction { get; set; }
        [Required]
        [Display(Name = "Gearbox Type")]
        public string gearboxType { get; set; }
        [Required]
        [Display(Name = "Number of Doors")]
        public string numberOfDoors { get; set; }
        [Required]
        [Display(Name = "Engine Capacity")]
        public string engineCapacity { get; set; }
        [Required]
        [Display(Name = "Fuel type")]
        public string fuelType { get; set; }
        [Required]
        [Display(Name = "Car Color")]
        public string carColor { get; set; }
        [Required]
        [Display(Name = "Car Description")]
        public string carDescription { get; set; }
        [Required]
        [Display(Name = "Car Price")]
        public float carPrice { get; set; }
        [Required]
        [Display(Name = "Car Deposit")]
        public float carDeposit { get; set; }
        public Boolean available { get; set; }

    }
}
