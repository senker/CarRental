package view.states;

import Model.Car;

import java.util.Scanner;

public class EditCarMenuState extends CarMenuState {
    Scanner keyInput = new Scanner(System.in);
    @Override
    public String handle(String input) {
//        switch (input) {
//            case "back":
//                currentState = states.get(1);
//                return "";
//            case "all":

////                StringBuilder allCarsInfoStringBuilder = new StringBuilder();
////                cars.forEach((car) -> allCarsInfoStringBuilder.append("\n").append(car.toString()));
////                return allCarsInfoStringBuilder.toString();
//        }
        if (input.equals("back")) {
            currentState = states.get(1);
        }

        Car carSearchResult = findCar(input);

        if (carSearchResult == null) {
            currentState = states.get(1);
            return "No car with such plates is registered";
        }
        else {
            carSearchResult = editCar();
            currentState = states.get(1);
            return "Car has been edited!";
        }
        }

    @Override
    public String init() {
        return "Enter car plates or enter 'all' to print information about all registered cars";
    }

    private Car findCar(String plates) {
        for (Car car: cars) {
            if (car.getRegNumber().equals(plates))
                return car;
        }

        return null;
    }
    private Car editCar()
    {
        System.out.println("Enter registration number:");
        String tRegNumber = keyInput.nextLine();


        System.out.println("Enter car brand:");
        String tCarBrand = keyInput.nextLine();


        System.out.println("Enter car model:");
        String tCarModel = keyInput.nextLine();


        System.out.println("Enter year of production:");
        String tYearOfProduction = keyInput.nextLine();


        System.out.println("Enter gear box type:");
        String tGearBoxType = keyInput.nextLine();


        System.out.println("Enter number of doors:");
        String tNumberOfDoors = keyInput.nextLine();

        System.out.println("Enter engine capacity:");
        String tEngineCapavity = keyInput.nextLine();


        System.out.println("Enter fuel type:");
        String tFuelType = keyInput.nextLine();


        System.out.println("Enter car color:");
        String tCarColor = keyInput.nextLine();


        System.out.println("Enter car description:");
        String tCarDescription = keyInput.nextLine();


        System.out.println("Enter car price:");
        float tCarPrice = checkIfEmptyAndFloat("Enter car price:");

        System.out.println("Enter car deposit:");
        float tCarDeposit = checkIfEmptyAndFloat("Enter car deposit:");

        return new Car(tRegNumber,tCarBrand,tCarModel,tYearOfProduction,tGearBoxType,tNumberOfDoors,tEngineCapavity,tFuelType,tCarColor,tCarDescription,tCarPrice,tCarDeposit);

    }

    public float checkIfEmptyAndFloat(String s)   // Since "" is also not a float, while verifying if it matches the data type it will also check if it is empty
    {
        float f;
        do {
            try {
                String temp = keyInput.nextLine();
                f = Float.parseFloat(temp);
                break;
            }
            catch (Exception e)
            {
                System.out.println("As a number, please "+s.toLowerCase());
            }
        }while (true);
        return f;
    }

}

