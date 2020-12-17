
import java.util.Scanner;
public class SwitchCase {
static int choice;
	public static void main(String[] args) {
		
  		System.out.println("Pick one: 1.Hi\t2. Hey\t3. Hello");
  		Scanner s= new Scanner(System.in);
  		choice = s.nextInt();
  		switch(choice)
  		{ 
  			case 1: System.out.println("You Selected Hi!");
  			break;
  			case 2: System.out.println("You Selected Hey!");
  			break;
  			case 3: System.out.println("You Selected Hello!");
  			break;
  			default: System.out.println("Invalid Choice");
  		}
	}

}
