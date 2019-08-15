package view.states;

import HTTP_Requests.HttpURLConnectionExample;
import Model.Request;

public class GetAllRequestsState extends RequestMenuState {
	
	HttpURLConnectionExample http = new HttpURLConnectionExample();
	
	@Override
    public String handle(String input) {
        
			switch (input) {
			   
				case "back":
			        currentState = states.get(5);
			        return "";
			    
			    case "pending":
				try {
						String returnStr = "";
						for (Request tmp: http.getAllPendingRequests()){
				              returnStr = returnStr + tmp.toString() + "\n";
				          }
						return returnStr;
					} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				
			    case "accepted":
					try {
							String returnStr = "";
							for (Request tmp: http.getAllAcceptedRequests()){
					              returnStr = returnStr + tmp.toString() + "\n";
					          }
							return returnStr;
						} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
		
			}
			return "";
    
	}
    @Override
    public String init() {
        return "type 'pending' to view pending requests or \ntype 'accepted' to view accepted requests or \ntype 'back' to return in the previous menu";
    }

        
    }

