package aggregationAndEncapsulation1;




public class TestCustomer {

	public static void main(String[] args) {
		
		Address a=new Address("1st Main HSR Layout", "Banglore");
		Address a1=new Address("1st Main Electronic City", "Banglore");
		
		 Customer c=new Customer("John",a,a1);
		 System.out.println(c.getCustomerDetails());

	}

}
