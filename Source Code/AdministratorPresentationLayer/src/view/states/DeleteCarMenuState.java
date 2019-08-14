package view.states;

import java.io.IOException;

import org.apache.http.client.methods.HttpPost;

import HTTP_Requests.HttpURLConnectionExample;

public class DeleteCarMenuState extends MenuState {
	
	HttpURLConnectionExample http = new HttpURLConnectionExample();
	@Override
	public String handle(String input) 
    {
        if (input.equals("back"))
        {
            currentState = states.get(1);
            return "";
        }
        
      
        try 
        {
			http.deleteCar(input);
		} catch (IOException e) 
        {
			e.printStackTrace();
		}
        return "CAR WAS REMOVED SUCCESSFULLY TO THE SYSTEM!";
    }

	@Override
	public String init() {
		return "Enter car registration number:";
	}

}
