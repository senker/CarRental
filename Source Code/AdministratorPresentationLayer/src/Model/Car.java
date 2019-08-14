package Model;

public class Car 
{
	private String registrationNumber;
	private String carBrand;
	private String carModel;
	private String yearOfProduction;
	private String gearboxType;
	private String numberOfDoors;
	private String engineCapacity;
	private String fuelType;
	private String carColor;
	private String carDescription;
	private float carPrice;
	private float carDeposit;
	
	

	public Car(String registrationNumber, String carBrand, String carModel, String yearOfProduction, String gearBoxType,
			String numberOfDoors, String engineCapacity, String fuelType, String carColor, String carDescription,
			float carPrice, float carDeposit) 
	{
		this.registrationNumber = registrationNumber;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.yearOfProduction = yearOfProduction;
		this.gearboxType = gearBoxType;
		this.numberOfDoors = numberOfDoors;
		this.engineCapacity = engineCapacity;
		this.fuelType = fuelType;
		this.carColor = carColor;
		this.carDescription = carDescription;
		this.carPrice = carPrice;
		this.carDeposit = carDeposit;
	}

	public String getRegNumber() {
		return registrationNumber;
	}

    public void setRegNumber(String regNumber) {
        this.registrationNumber = regNumber;
    }

    public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public void setDateOfProduction(String yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public String getGearBoxType() {
		return gearboxType;
	}

	public void setGearBoxType(String gearBoxType) {
		this.gearboxType = gearBoxType;
	}

	public String getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(String numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarDescription() {
		return carDescription;
	}

	public void setCarDescription(String carDescription) {
		this.carDescription = carDescription;
	}

	public float getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}

	public float getCarDeposit() {
		return carDeposit;
	}

	public void setCarDeposit(float carDeposit) {
		this.carDeposit = carDeposit;
	}

    public String getYearOfProduction() {
        return yearOfProduction;
    }
    @Override
    public String toString() 
    {
    	return this.getRegNumber() + " -*-*- " + this.getCarBrand() + " -*-*- " + this.getCarModel() + " -*-*- " + this.getYearOfProduction() + " -*-*- " + this.getGearBoxType();
    }
}
