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
import com.google.gson.Gson;
import Model.Car;

public class HttpURLConnectionExample {

	private final String USER_AGENT = "Mozilla/5.0";

	
	public Car[] getAllCars() throws Exception {
		String url = "http://localhost:63907/api/Cars";
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
		URL url = new URL("http://localhost:63907/api/Cars/" + regNr);
		HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
		httpCon.setDoOutput(true);
		httpCon.setRequestProperty("User-Agent", USER_AGENT );
		httpCon.setRequestMethod("DELETE");
		httpCon.connect();
		int responseCode = 0;
		System.out.print(httpCon.getResponseCode());
		
	}
	
	public void PostCar(Car tCar) throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost("http://localhost:63907/api/Cars");
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

            System.out.println("Executing request " + httpPost.getRequestLine());

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
            
         //   String responseBody = httpclient.execute(httpPost, responseHandler);
         //   System.out.println("----------------------------------------");
        //    System.out.println(responseBody);
        }
    }
	
	
	
	
}