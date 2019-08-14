package view.states;

import HTTP_Requests.HttpURLConnectionExample;
import Model.Car;

public class GetCarMenuState extends CarMenuState {
	
	HttpURLConnectionExample http = new HttpURLConnectionExample();
	
	@Override
    public String handle(String input) {
        try {
			switch (input) {
			    case "back":
			        currentState = states.get(1);
			        return "";
			    
			    case "all":
			    	
			    	String returnStr = "";
			    	for (int i = 0; i < http.getAllCars().length; i++)
			    	{
			    		returnStr = returnStr +  http.getAllCars()[i].toString() + "\n";
			    	}
			    	return returnStr;
							}
			} catch (Exception e) 
        {
			e.printStackTrace();
		}

        Car carSearchResult;
		try {
			carSearchResult = http.getCarByRegistationNumber(input);
			if(carSearchResult == null)
	            return "No CAR with such registration number is registered";
	        else
	            return carSearchResult.toString();
		
		
		} catch (Exception e) 
		
		{
			e.printStackTrace();
		}
		
		return "";
    }

    @Override
    public String init() {
        return "Enter car registration number \nor enter 'all' to print information about all registered cars\nor type 'back' to return in the previous menu";
    }

        
    }

