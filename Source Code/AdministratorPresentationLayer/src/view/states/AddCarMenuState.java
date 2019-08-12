package view.states;

import Model.Car;
import java.util.Scanner;

public class AddCarMenuState extends CarMenuState {
    
	Scanner keyInput = new Scanner(System.in);
	
	@Override
    public String handle(String input) 
    {
        if (input.equals("back"))
        {
            currentState = states.get(1);
            return "";
        }
        
      
        
        return "";
    }
    
    public Car inputCarInfo()
    {
    	System.out.println("Enter registration number:");
        String tRegNumber = keyInput.nextLine();
        System.out.println("Enter car brand:");
        String tCarBrand = keyInput.nextLine();
        System.out.println("Enter car model:");
        String tCarModel = keyInput.nextLine();
        System.out.println("Enter year of production:");
        String tYearOfProduction = keyInput.nextLine();
        System.out.println("Enter gear box type:");
        String tGearBoxType = keyInput.nextLine();
        System.out.println("Enter number of doors:");
        String tNumberOfDoors = keyInput.nextLine();
        System.out.println("Enter engineCapacity:");
        String tEngineCapavity = keyInput.nextLine();
        System.out.println("Enter fuel type:");
        String tFuelType = keyInput.nextLine();
        System.out.println("Enter car color:");
        String tCarColor = keyInput.nextLine();
        System.out.println("Enter car description:");
        String tCarDescription = keyInput.nextLine();
        System.out.println("Enter car price:");
        String tCarPrice = keyInput.nextLine();
        System.out.println("Enter car deposit:");
        String tCarDeposit = keyInput.nextLine();
        currentState = states.get(1);
        return new Car(tRegNumber,tCarBrand,tCarModel,tYearOfProduction,tGearBoxType,tNumberOfDoors,tEngineCapavity,tFuelType,tCarColor,tCarDescription,Float.parseFloat(tCarPrice),Float.parseFloat(tCarDeposit));
    
    }
    
  

    @Override
    public String init() 
    {
    	cars.add(inputCarInfo());   
    	return "CAR ADDED SUCCESSFULLY TO THE SYSTEM!";
        
    }
}
