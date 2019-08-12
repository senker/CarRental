package view.states;

import java.util.ArrayList;

public abstract class MenuState {
    protected static ArrayList<MenuState> states;
    protected static MenuState currentState;

    public abstract String handle(String input);
    public abstract String init();
}

