package Scanner;

import java.util.Scanner;

public class Areaoftringle {
	public static void main(String[] args) {
		try (Scanner area = new Scanner(System.in)) {
			System.out.println("Enter the Base of tringle");
			int base=area.nextInt();
			
			System.out.println("Enter the height of tringle");
			int height=area.nextInt();
			
			double Area=0.5*base*height;
			
			System.out.println("Area of tringlr:"+Area);
		}
	}
}
