package HTTP_Requests;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import Model.Car;
import Model.Request;

public class HttpURLConnectionExample {

	private final String USER_AGENT = "Mozilla/5.0";
	private final String HOST = "51750";
	
	public Car[] getAllCars() throws Exception {
		String url = "http://localhost:"+HOST+"/api/Cars";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) 
		{
			response.append(inputLine);
		}
		in.close();
		Gson g = new Gson();
		Car[] CarG = g.fromJson(response.toString(),Car[].class);
		return CarG;
	}
	
	public Request[] getAllRequests() throws Exception {
		String url = "http://localhost:"+HOST+"/api/Customers";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) 
		{
			response.append(inputLine);
		}
		in.close();
		Gson g = new Gson();
		Request[] RequestG = g.fromJson(response.toString(),Request[].class);
		return RequestG;
	}
	
	public ArrayList<Request> getAllPendingRequests() throws Exception {
		Request[] allReq = getAllRequests();
		
		ArrayList<Request> pendingReq = new ArrayList<Request>();
		
		for (int i = 0; i < allReq.length; i++)
		{
			if (allReq[i].getRequestState().equals("pending"))
			{
				pendingReq.add(allReq[i]);
			}
		}
		
		return pendingReq;
		
 	}
	
	public ArrayList<Request> getAllAcceptedRequests() throws Exception {
		Request[] allReq = getAllRequests();
		
		ArrayList<Request> acceptedReq = new ArrayList<Request>();
		
		for (int i = 0; i < allReq.length; i++)
		{
			if (allReq[i].getRequestState().equals("accepted"))
			{
				System.out.println("test");
				acceptedReq.add(allReq[i]);
			}
		}
		
		return acceptedReq;
		
 	}
	
	public Car getCarByRegistationNumber(String regNumb) throws Exception
	{
		Car[] tCars = getAllCars();
		for(int i = 0; i < tCars.length; i++)
		{
			if (regNumb.equals(tCars[i].getRegNumber()))
			{
				return tCars[i];
			}
		}
		return null;
	}
	
	public void deleteCar(String regNr) throws IOException
	{
		URL url = new URL("http://localhost:"+HOST+"/api/Cars/" + regNr);
		HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
		httpCon.setDoOutput(true);
		httpCon.setRequestProperty("User-Agent", USER_AGENT );
		httpCon.setRequestMethod("DELETE");
		httpCon.connect();
		if (httpCon.getResponseCode() < 400)
			System.out.println("DELETED SUCCESSFULLY!");
	}
	
	public void deleteRequest(String SSN) throws IOException
	{
		URL url = new URL("http://localhost:"+HOST+"/api/Customers/" + SSN);
		HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
		httpCon.setDoOutput(true);
		httpCon.setRequestProperty("User-Agent", USER_AGENT );
		httpCon.setRequestMethod("DELETE");
		httpCon.connect();
		if (httpCon.getResponseCode() < 400)
		System.out.println("DELETED SUCCESSFULLY!");
	}
	
	public void acceptRequest(String SSN) throws Exception
	{
		Request[] tReq = getAllRequests();
		Request req1 = new Request();
		int t = -1;
		
		for(int i = 0; i < tReq.length; i++)
		{
			if (SSN.equals(tReq[i].getSocialSecurityNumber()))
			{
				req1 = tReq[i];
				t = i;
			}
		}
		deleteRequest(tReq[t].getSocialSecurityNumber());
		PostRequest(req1);		
	}
	
	public void PostRequest(Request tempRequest) throws IOException
	{
		try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost("http://localhost:"+HOST+"/api/Customers");
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            
            String json = 
            	  "  {\r\n" + 
            	  "  \"socialSecurityNumber\":\""+ tempRequest.getSocialSecurityNumber()+"\",\r\n" +	  	
  				  "  \"firstName\":\""+ tempRequest.getFirstName()+"\",\r\n" + 
  				  "  \"lastName\":\""+ tempRequest.getLastName()+"\",\r\n" +
  				  "  \"dateOfBirth\":\""+ tempRequest.getDateOfBirth()+"\",\r\n" +
  				  "  \"address\":\""+ tempRequest.getAddress()+"\",\r\n" +
  				  "  \"phoneNumber\":\""+ tempRequest.getPhoneNumber()+"\",\r\n" +
  				  "  \"nationality\":\""+ tempRequest.getNationality()+"\",\r\n" +
  				  "  \"driverLicenseId\":\""+ tempRequest.getDriverLicenseId()+"\",\r\n" +
  				  "  \"startDate\":\""+tempRequest.getStartDate()+"\",\r\n" +
  				  "  \"endDate\":\""+tempRequest.getEndDate()+"\",\r\n" +  
  			//	  "  \"requestState\":\""+tempRequest.getRequestState() +  "\",\r\n" +
  				  "  \"requestState\":\"accepted\",\r\n" +
  				  "  \"requestedCar\":\""+tempRequest.getRequestedCar()+"\",\r\n" +
  				  "}";
            	
            StringEntity stringEntity = new StringEntity(json);
            httpPost.setEntity(stringEntity);
           // System.out.println("Executing request " + httpPost.getRequestLine());

            // Create a custom response handler
            ResponseHandler < String > responseHandler = response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            };
            httpclient.execute(httpPost, responseHandler);
           // String responseBody = httpclient.execute(httpPost, responseHandler);
           // System.out.println("----------------------------------------");
           // System.out.println(responseBody);
        }
	}
	
	public void PostCar(Car tCar) throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost("http://localhost:"+HOST+"/api/Cars");
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            
            String json = 
            	  "  {\r\n" + 
            	  "  \"registrationNumber\":\""+ tCar.getRegNumber()+"\",\r\n" +	  	
  				  "  \"carModel\":\""+ tCar.getCarModel()+"\",\r\n" + 
  				  "  \"carBrand\":\""+ tCar.getCarBrand()+"\",\r\n" +
  				  "  \"yearOfProduction\":\""+ tCar.getYearOfProduction()+"\",\r\n" +
  				  "  \"gearboxType\":\""+ tCar.getGearBoxType()+"\",\r\n" +
  				  "  \"numberOfDoors\":\""+ tCar.getNumberOfDoors()+"\",\r\n" +
  				  "  \"engineCapacity\":\""+ tCar.getEngineCapacity()+"\",\r\n" +
  				  "  \"fuelType\":\""+ tCar.getFuelType()+"\",\r\n" +
  				  "  \"carColor\":\""+tCar.getCarColor()+"\",\r\n" +
  				  "  \"carDescription\":\""+tCar.getCarDescription()+"\",\r\n" +  
  				  "  \"carPrice\":\""+tCar.getCarPrice()+"\",\r\n" +
  				  "  \"carDeposit\":\""+tCar.getCarDeposit()+"\",\r\n" +
  				  "}";
            	
            StringEntity stringEntity = new StringEntity(json);
            httpPost.setEntity(stringEntity);
          //  System.out.println("Executing request " + httpPost.getRequestLine());

            // Create a custom response handler
            ResponseHandler < String > responseHandler = response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            };
            httpclient.execute(httpPost, responseHandler);
           // String responseBody = httpclient.execute(httpPost, responseHandler);
            //System.out.println("----------------------------------------");
          //  System.out.println(responseBody);
        }
    }
	
	
	
	
}