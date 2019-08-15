package view.states;

public class RequestMenuState extends MenuState {

    @Override
    public String handle(String input) {
        switch (input){
            case "1": currentState = states.get(6);
                return "";
            case "2": currentState = states.get(7);
            	return "";
            case "3": currentState = states.get(8);
            	return "";
            case "back": currentState = states.get(0);
                return "";
            default:
                return "no such option is available";
        }
    }

    @Override
    public String init() {
        return "-------------------------" + "\n" + "1.VIEW ALL REQUESTS" + "\n" + "2.REJECT REQUEST" + "\n" + "3.ACCEPT REQUEST"+ "\n" + "-------------------------" ;
    }
}
