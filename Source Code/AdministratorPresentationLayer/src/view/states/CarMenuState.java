package view.states;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMenuState extends MenuState {
    protected static List<Car> cars = new ArrayList<>();

    @Override
    public String handle(String input) {
        switch (input){
            case "1": currentState = states.get(2);
                return "";
            case "2": currentState = states.get(3);
            	return "";
            case "4": currentState = states.get(4);
            	return "";
            case "back": currentState = states.get(0);
                return "";
            default:
                return "no such option is available";
        }
    }

    @Override
    public String init() {
        return "-------------" + "\n" + "1. ADD" + "\n" + "2. GET" + "\n" + "3. EDIT" + "\n" + "4. DELETE\n" + "-------------" ;
    }
}
