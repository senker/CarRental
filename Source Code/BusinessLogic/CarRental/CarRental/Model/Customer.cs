using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace CarRental.Model
{
    public class Customer
    {
        [Key]
        [Required]
        public string socialSecurityNumber { get; set; }
        [Required]
        public string firstName { get; set; }
        [Required]
        public string lastName { get; set; }
        [Required]
        public DateTime dateOfBirth { get; set; }
        [Required]
        public string address { get; set; }
        [Required]
        public string phoneNumber { get; set; }
        [Required]
        public string nationality { get; set; }
        [Required]
        public string driverLicenseId { get; set; }
        public string request(TimePeriod timePeriod, Car car)
        {
            return timePeriod + "/" + car;
        }
    }
}
