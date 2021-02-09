package aggregationAndEncapsulation1;


public class Customer {

	private String customerName;
	private Address residentialAddress;
	private  Address officeAddress;
	
	
	
	public Customer() {
		super();
	}
	public Customer(String customerName, Address residentialAddress,Address officeAddress) {

		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officeAddress=officeAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public Address getOfficeAddress() {
		return officeAddress;
	}
	
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getCustomerDetails()
	{
		return "Customer: "+getCustomerName()+ "\n" +"Residential Address :"+getResidentialAddress()+"\n"+"OfficeAddress: "+getOfficeAddress();
	}



}
