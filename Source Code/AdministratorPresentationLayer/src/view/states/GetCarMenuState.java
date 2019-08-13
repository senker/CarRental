package view.states;

import HTTP_Requests.HttpURLConnectionExample;
import Model.Car;

public class GetCarMenuState extends CarMenuState {
    @Override
    public String handle(String input) {
        try {
			switch (input) {
			    case "back":
			        currentState = states.get(1);
			        return "";
			    case "all":
			        StringBuilder allCarsInfoStringBuilder = new StringBuilder();
			        cars.forEach((car) -> allCarsInfoStringBuilder.append("\n").append(car.toString()));
			        return allCarsInfoStringBuilder.toString();
			    case "req":
			    	HttpURLConnectionExample http = new HttpURLConnectionExample();
			    	return http.getCarById("1").getCarBrand();
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        Car carSearchResult = findCar(input);

        if(carSearchResult == null)
            return "No car with such registration number is registered";
        else
            return carSearchResult.getCarBrand() + " " + carSearchResult.getCarModel();
    }

    @Override
    public String init() {
        return "Enter car registration number or enter 'all' to print information about all registered cars";
    }

    private Car findCar(String plates) {
        for (Car car: cars) {
            if (car.getRegNumber().equals(plates))
                return car;
        }

        return null;
    }
}
