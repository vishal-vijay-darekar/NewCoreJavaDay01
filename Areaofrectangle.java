package Scanner;

import java.util.Scanner;

public class Areaofrectangle {
	public static void main(String[] args) {
		Scanner area=new Scanner(System.in);
		
		System.out.println("enter the width of rectanglr");
		int width=area.nextInt();
		
		System.out.println("enter the lenght of rectangle");
		int lenght=area.nextInt();
		
		int Area=width * lenght;
		
		System.out.println("Area of rectanglr:"+Area);
	}
}
