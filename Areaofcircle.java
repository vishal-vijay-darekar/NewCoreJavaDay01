package Scanner;

import java.util.Scanner;

public class Areaofcircle {
	public static void main(String[] args) {
		Scanner area= new Scanner(System.in);
		
		System.out.println("Enter Radius of circle");
		int radius=area.nextInt();
		
		int Area=(int) (3.14*radius*2);
		
		System.out.println("Area of circle:"+Area);
	}
}
