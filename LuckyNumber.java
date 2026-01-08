package LuckyNumber;
// import Scanner class from java.util package to receive user input
import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
        // create Scanner object to collect stream from console
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        scanner.close();
		//write the logic to implement the solution
		// int inputNum = 1623;
		// utilize String.valueOf() method to convert 'inputNum' to String 
		// String inputStr = String.valueOf(inputNum);
		// add up sum
		int sum = 0;
		// iterate through each digit of 'inputNum'
		for(int i = 0; i < inputStr.length(); ++i){
		    if(i % 2 == 1){
		        // sum += Math.sqrt(inputStr[i]);
                // convert selected char at index i to its ASCII value ...
                // ... minus by ASCII value of '0' for actual digit
                int digit = inputStr.charAt(i) - '0';
                // compute square of digit via 'Math.pow()' method
                sum += Math.pow(digit, 2);
		    }
		}
		if(sum % 9 == 0){
		    System.out.println("The number " + inputStr + " is a Lucky number");
		}
		else{
		    System.out.println("Oops! Not a Lucky number");
		}
	}

}
