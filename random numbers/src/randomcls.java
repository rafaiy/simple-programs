import java.util.Random;
import java.util.Scanner;
public class randomcls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,counter;
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		counter = sc.nextByte();
		
		while(counter != 0){
			
		 a=ran.nextInt(50);
		 System.out.println("random no is"+a);
		 counter--;
			
		
			
			
		}

	}

}
