public class Problem2 {
	public static void main(String[] args) {
		
		double hourlyRate = 17.52;
		double taxRate = .25;
		double hoursWorked = 40;
		
		double grossPay = hourlyRate*hoursWorked;
		
		double netPay = grossPay - (grossPay*taxRate);
	
		
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Net Pay: " + netPay);
	
		
	}

}
