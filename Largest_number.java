
import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers to find largest number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("A is largest number");
		}
		else if(b>=a && b>=c) {
			System.out.println("B is largest number");
		}
		else {
			System.out.println("C is largest number");
		}
		sc.close();

	}

}