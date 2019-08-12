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
        public string registrationNumber { get; set; }
        [Required]
        [Display(Name = "Car Model")]
        public string carModel { get; set; }
        [Required]
        public string carBrand { get; set; }
        [Required]
        public DateTime dateOfProduction { get; set; }
        [Required]
        public string gearboxType { get; set; }
        [Required]
        public string numberOfDoors { get; set; }
        [Required]
        public string engineCapacity { get; set; }
        [Required]
        public string fuelType { get; set; }
        [Required]
        public string carColor { get; set; }
        [Required]
        public string carDescription { get; set; }
        [Required]
        public float carPrice { get; set; }
        [Required]
        public float carDeposit { get; set; }
        [Required]
        public List<TimePeriod> timePeriod { get; set; }

    }
}
