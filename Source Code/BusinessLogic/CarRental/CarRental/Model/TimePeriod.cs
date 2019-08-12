using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace CarRental.Model
{
    public class TimePeriod
    {
        [Key]
        [Required]
        public DateTime startDate { get; set; }
        [Required]
        public DateTime endDate { get; set; }
        public double duration(DateTime startDate, DateTime endDate)
        {
            return (startDate - endDate).TotalDays;
        }

    }
}
