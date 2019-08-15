package view.states;

import HTTP_Requests.HttpURLConnectionExample;

public class AcceptRequestMenuState extends RequestMenuState {
	
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
			http.acceptRequest(input);
		} catch (Exception e) 
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
