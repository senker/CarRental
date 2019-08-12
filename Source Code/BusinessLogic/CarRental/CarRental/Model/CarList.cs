using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CarRental.Model
{
    public class CarList
    {
        public List<Car> cars;

        public CarList()
        {
            List<Car> carList = new List<Car>();
        }

        public void addCar(Car car)
        {
            cars.Add(car);
        }
        public void deleteCar(string regNumber)
        {
            for (int i = 0; i < cars.Capacity; i++)
            {
                if (cars[i].registrationNumber.Equals(regNumber))
                {
                    cars.RemoveAt(i);
                }
            }
        }
        public List<Car> returnAllCars(Car car)
        {
            return cars;
        }
    }
}
