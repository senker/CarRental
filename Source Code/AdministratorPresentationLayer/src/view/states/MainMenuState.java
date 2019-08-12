package view.states;

public class MainMenuState extends MenuState {

    @Override
    public String handle(String input) {
        switch (input){
            case "1":
                currentState = states.get(1);
                return "";
            
            default: return "no such option is available";
        }
    }

    @Override
    public String init() {
        return "-------------" + "\n" + "1. CARS" + "\n" + "2. REQUESTS" + "\n" + "-------------";
    }
}
