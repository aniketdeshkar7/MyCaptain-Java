import java.util.Scanner;
public class MinutesinYear {
	public static void main(String[] Strings) {
		double minIntoYear = 60*24*365;
		Scanner input = new Scanner(System.in);
		System.out.println("Input Number of Minutes:");
		double min = input.nextDouble();
		long year = (long)(min/minIntoYear);
		int days = (int)(min/60/24)%365;
		System.out.println((int) min + " Minutes is approx " + year + " Years & " + days + " days");
		
		
}
}