package linecomputation;
	import java.util.Scanner;
	public class LineComp3 {
		public static void main(String args[]) {
		System.out.println("Enter value for line-1:");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1: ");
		float x1 = sc.nextFloat();
		System.out.print("Enter y1: ");
		float y1 = sc.nextFloat();
		System.out.print("Enter x2: ");
		float x2 = sc.nextFloat();
		System.out.print("Enter y2: ");
		float y2 = sc.nextFloat();
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Enter value for line-2:");
		System.out.print("Enter a1: ");
		float a1 = sc.nextFloat();
		System.out.print("Enter b1: ");
		float b1 = sc.nextFloat();
		System.out.print("Enter a2: ");
		float a2 = sc.nextFloat();
		System.out.print("Enter b2: ");
		float b2 = sc.nextFloat();
		sc.close();
		double length2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
		String line1 = String.valueOf(length1);
		String line2 = String.valueOf(length2);
		if (line1.compareTo(line2) == 0)
			System.out.println("Line 1 and Line 2 are equal");
		else if (line1.compareTo(line2) > 0)
			System.out.println("Line 1 is greater than Line 2");
		else if (line2.compareTo(line1) > 0)
			System.out.println("Line 2 is greater than Line 1");
		}
	}
