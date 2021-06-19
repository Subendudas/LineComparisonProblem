import java.util.Scanner;
public class LineComp {
	public static void main(String args[]) {
	System.out.println("Welcome To Line Comparison Computation Program:");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter x1: ");
	float x1 = sc.nextFloat();
	System.out.print("Enter y1: ");
	float y1 = sc.nextFloat();
	System.out.print("Enter x2: ");
	float x2 = sc.nextFloat();
	System.out.print("Enter y2: ");
	float y2 = sc.nextFloat();
	sc.close();
	double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	System.out.println("Length of the line is: " + length );
	}
}