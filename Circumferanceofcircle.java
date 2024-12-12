package Scanner;

import java.util.Scanner;

public class Circumferanceofcircle {
	public static void main(String[] args) {
		Scanner area= new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int radius=area.nextInt();
		
		double Area=2*3.14*radius;
		
		System.out.println("Circumferance of circle:"+Area);
	}
}
