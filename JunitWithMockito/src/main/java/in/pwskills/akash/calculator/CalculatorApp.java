package in.pwskills.akash.calculator;

public class CalculatorApp {
	
	static {
		System.out.println("CalculatorApp.class file is loading........");
	}
	
	public CalculatorApp() {
		System.out.println("CalculatorApp Object is created..");
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public boolean isEven(int a) {
		return a%2==0;
	}
	
}
