package trainingcodes;
/**
 * 
 */

/**
 * @author dell
 *
 */
import java.util.Scanner;
public class Program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		
		if(age<18) {
			System.out.println("you are minor!!!");
		}
		else if(age>65){
			System.out.println("you are major");
		}
		else {
			System.out.println("congrats you are eligible");
		}

	}

}
