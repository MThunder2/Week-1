
public class LabClass {
public static void main(String[] args) {
	
	int openPlaneSeats = 8;
	
	double costOfGroceries = 145.98;
	
	char middleInitial = 'C';
	
	boolean isHotOutside = false;
	
	String customerFirstName = "Larry";
	
	String streetAddress = "777 Casino Way";
	
	System.out.println(openPlaneSeats);
	System.out.println(costOfGroceries);
	System.out.println(middleInitial);
	System.out.println(isHotOutside);
	System.out.println(customerFirstName);
	System.out.println(streetAddress);
	
	
	openPlaneSeats -= 2;
	System.out.println(openPlaneSeats);
	
	costOfGroceries += 2.15;
	System.out.println(costOfGroceries);
	
	middleInitial = 'B';
	System.out.println(middleInitial);
	
	isHotOutside = !isHotOutside;
	System.out.println(isHotOutside);
	
	String fullName = customerFirstName + " " + middleInitial + " " + "Johnson";
	System.out.println(fullName);
	
	System.out.println("Hi my name is " + fullName + " and I live at " + streetAddress); 
	
	
	
	
	

	


	
	
	
	
			
	
	
}
}
