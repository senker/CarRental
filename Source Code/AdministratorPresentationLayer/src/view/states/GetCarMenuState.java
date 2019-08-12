package view.states;

import Model.Car;

public class GetCarMenuState extends CarMenuState {
    @Override
    public String handle(String input) {
        switch (input) {
            case "back":
                currentState = states.get(1);
                return "";
            case "all":
                StringBuilder allCarsInfoStringBuilder = new StringBuilder();
                cars.forEach((car) -> allCarsInfoStringBuilder.append("\n").append(car.toString()));
                return allCarsInfoStringBuilder.toString();
        }

        Car carSearchResult = findCar(input);

        if(carSearchResult == null)
            return "No car with such plates is registered";
        else
            return carSearchResult.toString();
    }

    @Override
    public String init() {
        return "Enter car plates or enter 'all' to print information about all registered cars";
    }

    private Car findCar(String plates) {
        for (Car car: cars) {
            if (car.plates.equals(plates))
                return car;
        }

        return null;
    }
}
