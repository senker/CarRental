package Model;

public class Car 
{
	private String regNumber;
	private String carBrand;
	private String carModel;
	private String yearOfProduction;
	private String gearBoxType;
	private String numberOfDoors;
	private String engineCapacity;
	private String fuelType;
	private String carColor;
	private String carDescription;
	private float carPrice;
	private float carDeposit;
	
	

	public Car(String regNumber, String carBrand, String carModel, String yearOfProduction, String gearBoxType,
			String numberOfDoors, String engineCapacity, String fuelType, String carColor, String carDescription,
			float carPrice, float carDeposit) 
	{
		this.regNumber = regNumber;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.yearOfProduction = yearOfProduction;
		this.gearBoxType = gearBoxType;
		this.numberOfDoors = numberOfDoors;
		this.engineCapacity = engineCapacity;
		this.fuelType = fuelType;
		this.carColor = carColor;
		this.carDescription = carDescription;
		this.carPrice = carPrice;
		this.carDeposit = carDeposit;
	}

	public String getRegNumber() {
		return regNumber;
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

	public String yearOfProduction() {
		return yearOfProduction;
	}

	public void setDateOfProduction(String yearOfProduction) {
		this.yearOfProduction = yearOfProduction();
	}

	public String getGearBoxType() {
		return gearBoxType;
	}

	public void setGearBoxType(String gearBoxType) {
		this.gearBoxType = gearBoxType;
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
	
	
}
