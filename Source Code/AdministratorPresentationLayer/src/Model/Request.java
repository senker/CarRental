package Model;


public class Request {
	
	private String socialSecurityNumber;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String address;
	private String phoneNumber;
	private String nationality;
	private String driverLicenseId;
	private String startDate;
	private String endDate;
	private String requestState;
	private String requestedCar;
		
		
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDriverLicenseId() {
		return driverLicenseId;
	}
	public void setDriverLicenseId(String driverLicenseId) {
		this.driverLicenseId = driverLicenseId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getRequestState() {
		return requestState;
	}
	public void setRequestState(String requestState) {
		this.requestState = requestState;
	}
	public String getRequestedCar() {
		return requestedCar;
	}
	public void setRequestedCar(String requestedCar) {
		this.requestedCar = requestedCar;
	}
	@Override
	public String toString() {
		return "SSN:" + socialSecurityNumber + "||" + firstName + " "
				+ lastName + "||" + dateOfBirth + "||" + address + "||" + phoneNumber
				+ "||" + nationality + " DrID:" + driverLicenseId + " SD: " + startDate
				+ " ED: " + endDate + " status:" + requestState + " car:" + requestedCar;
	}
	
	

	

	
	
	
	

}
