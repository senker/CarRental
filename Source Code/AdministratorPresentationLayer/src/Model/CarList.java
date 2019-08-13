package Model;

import java.util.ArrayList;

public class CarList {
    private ArrayList<Car> cars;

    public CarList() {
        cars =  new ArrayList<Car>();
    }

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public void deleteCar(String registrationNumber)
    {
        for(int i=0; i<cars.size(); i++)
        {
            if(cars.get(i).getRegNumber().equals(registrationNumber))
            {
                cars.remove(i);
            }
        }
    }

    public void editCar(String registrationNumber,Car car)
    {
        for(int i=0; i<cars.size(); i++)
        {
            if(cars.get(i).getRegNumber().equals(registrationNumber))
            {
                cars.get(i).setRegNumber(car.getRegNumber());
                cars.get(i).setCarBrand(car.getCarBrand());
                cars.get(i).setCarModel(car.getCarModel());
                cars.get(i).setDateOfProduction(car.getYearOfProduction());
                cars.get(i).setGearBoxType(car.getGearBoxType());
                cars.get(i).setNumberOfDoors(car.getNumberOfDoors());
                cars.get(i).setEngineCapacity(car.getEngineCapacity());
                cars.get(i).setFuelType(car.getFuelType());
                cars.get(i).setCarColor(car.getCarColor());
                cars.get(i).setCarDescription(car.getCarDescription());
                cars.get(i).setCarPrice(car.getCarPrice());
                cars.get(i).setCarDeposit(car.getCarDeposit());

            }
        }
    }
    public int size()
    {
        return cars.size();
    }

}
