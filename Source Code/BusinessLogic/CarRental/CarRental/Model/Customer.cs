using CarRental.Pages;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;
using CarRental.Pages.CarList;

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

        //[BindProperty]
        //public IndexModel period { get; set; }
        //[BindProperty]
        //public CarModel car { get; set; }

        //selected time period - start date
        [DataType(DataType.Date)]
        public DateTime startPeriod { get; set; }
        //{
        //    return period.StartDate;
        //}
        //selected time period - end date
        [DataType(DataType.Date)]
        public DateTime endPeriod { get; set; }
        //{
        //    return period.EndDate;
        //}
        //selected car
        public int requestedCar { get; set; }
        //{
        //   return car.selectedCar;
        //}
    }
}
