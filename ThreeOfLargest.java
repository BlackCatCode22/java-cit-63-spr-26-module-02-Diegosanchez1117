package largestofthree;
import java.util.Scanner;

public class ThreeOfLargest {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        		    
		        System.out.print("Enter first integer: ");
		        int num1 = scanner.nextInt();		        		       
		        System.out.print("Enter second integer: ");
		        int num2 = scanner.nextInt();
		        		        
		        System.out.println("\nCOMPARISON:");
		        if (num1 > num2) {
		            System.out.println(num1 + " is greater than " + num2);
		        } else if (num1 < num2) {
		            System.out.println(num1 + " is less than " + num2);
		        } else {
		            System.out.println(num1 + " is equal to " + num2);
		        }
		        
		        int sum = num1 + num2;
		        System.out.println("\nSUM:");
		        System.out.println(num1 + " + " + num2 + " = " + sum);
		        		       
		    }		
}