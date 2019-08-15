package view.states;

import java.io.IOException;
import HTTP_Requests.HttpURLConnectionExample;

public class DeleteRequestMenuState extends RequestMenuState {
	
	HttpURLConnectionExample http = new HttpURLConnectionExample();
	@Override
	public String handle(String input) 
    {
        if (input.equals("back"))
        {
            currentState = states.get(5);
            return "";
        }
        
      
        try 
        {
			http.deleteRequest(input);
		} catch (IOException e) 
        {
			e.printStackTrace();
		}
        return "";
    }

	@Override
	public String init() {
		return "Enter SSN from the request: ";
	}

}
