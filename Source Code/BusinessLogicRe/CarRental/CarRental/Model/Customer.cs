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
        [Display(Name = "SSN")]
        public string socialSecurityNumber { get; set; }
        [Required]
        [Display(Name = "First Name")]
        public string firstName { get; set; }
        [Required]
        [Display(Name = "Last Name")]
        public string lastName { get; set; }
        [Required]
        [Display(Name = "Date Of Birth")]
        public DateTime dateOfBirth { get; set; }
        [Required]
        [Display(Name = "Address")]
        public string address { get; set; }
        [Required]
        [Display(Name = "Phone Number")]
        public string phoneNumber { get; set; }
        [Required]
        [Display(Name = "Nationality")]
        public string nationality { get; set; }
        [Required]
        [Display(Name = "Driver License ID")]
        public string driverLicenseId { get; set; }
        public string requestedCar { get; set; }

    }
}
