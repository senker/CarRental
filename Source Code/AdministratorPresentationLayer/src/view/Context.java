package view;

import view.states.*;

import java.util.ArrayList;

public class Context extends MenuState {

    @Override
    public String init() {
        return currentState.init();
    }

    @Override
    public String handle(String input){
        return currentState.handle(input);
    }

    Context(){
        states = new ArrayList<>();
        states.add(new MainMenuState());		//0
        states.add(new CarMenuState());			//1
        states.add(new AddCarMenuState());		//2
        states.add(new GetCarMenuState());		//3
        
        //states.add(new CustomerMenuState());	//4
        //states.add(new AddCustomerMenuState());	//5

        currentState = states.get(0);
    }

}
