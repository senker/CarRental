package view.states;

import Model.Car;

import java.util.InputMismatchException;
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
        
      
        cars.add(inputCarInfo()); 
        return "CAR WAS ADDED SUCCESSFULLY TO THE SYSTEM!";
    }
    
    public Car inputCarInfo()
    {
    	System.out.println("Enter registration number:");
        String tRegNumber = keyInput.nextLine();
        checkIfEmpty(tRegNumber,"Enter registration number:");

        System.out.println("Enter car brand:");
        String tCarBrand = keyInput.nextLine();
        checkIfEmpty(tCarBrand,"Enter car brand:");

        System.out.println("Enter car model:");
        String tCarModel = keyInput.nextLine();
        checkIfEmpty(tCarModel,"Enter car model:");

        System.out.println("Enter year of production:");
        String tYearOfProduction = keyInput.nextLine();
        checkIfEmpty(tYearOfProduction,"Enter year of production:");

        System.out.println("Enter gear box type:");
        String tGearBoxType = keyInput.nextLine();
        checkIfEmpty(tGearBoxType,"Enter gear box type:");

        System.out.println("Enter number of doors:");
        String tNumberOfDoors = keyInput.nextLine();
        checkIfEmpty(tNumberOfDoors,"Enter number of doors:");

        System.out.println("Enter engine capacity:");
        String tEngineCapavity = keyInput.nextLine();
        checkIfEmpty(tEngineCapavity,"Enter engine capacity:");

        System.out.println("Enter fuel type:");
        String tFuelType = keyInput.nextLine();
        checkIfEmpty(tFuelType,"Enter fuel type:");

        System.out.println("Enter car color:");
        String tCarColor = keyInput.nextLine();
        checkIfEmpty(tCarColor,"Enter car color:");

        System.out.println("Enter car description:");
        String tCarDescription = keyInput.nextLine();
        checkIfEmpty(tCarDescription,"Enter car description:");

        System.out.println("Enter car price:");
        float tCarPrice = checkIfEmptyAndFloat("Enter car price:");

        System.out.println("Enter car deposit:");
        float tCarDeposit = checkIfEmptyAndFloat("Enter car deposit:");

        return new Car(tRegNumber,tCarBrand,tCarModel,tYearOfProduction,tGearBoxType,tNumberOfDoors,tEngineCapavity,tFuelType,tCarColor,tCarDescription,tCarPrice,tCarDeposit);
    
    }
    public void checkIfEmpty(String s, String requirement)
    {
        String temp="";
        if(s.equals(""))
        {
            System.out.println("Please " +requirement.toLowerCase());
            temp = keyInput.nextLine();
            s=temp;
            checkIfEmpty(s,requirement);
        }
    }

    public float checkIfEmptyAndFloat(String s)   // Since "" is also not a float, while verifying if it matches the data type it will also check if it is empty
    {
        float f;
        do {
            try {
                String temp = keyInput.nextLine();
                f = Float.parseFloat(temp);
                break;
            }
            catch (Exception e)
            {
                System.out.println("As a number, please "+s.toLowerCase());
            }
        }while (true);
        return f;
    }

    
  

    @Override
    public String init() 
    {  
    	return "Press 'ENTER' to input information for new car or type 'back' to return in the previous menu";
    }
}
