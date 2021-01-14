public class AddTwoIntegers {

    public static void main(String[] args) {
        
		printText();
        int first = 10;
        int second = 20;

        System.out.println("Enter two numbers: " + first + " " + second);
        int sum = first + second;

        System.out.println("The sum is: " + sum);
		
		printTextAfter();
    }
	
	public static void printText(){
		System.out.println("Main Method started");
	}
	
		
	public static void printTextAfter(){
		System.out.println("Main Method ended");
	}
	
		
}
