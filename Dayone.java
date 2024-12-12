package Scanner;

import java.util.Scanner;

public class Dayone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int one=sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int two=sc.nextInt();
		
		int sum=one+two;
		
		System.out.println("total:"+sum);

	}

}
