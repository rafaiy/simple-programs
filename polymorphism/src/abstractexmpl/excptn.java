package abstractexmpl;

import java.util.Scanner;

public class excptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			 a = a/b;
			System.out.println(a);
			
			
		}
		catch(ArithmeticException A){
			
			System.out.println("this code will execute when error occur" + A );
			
		}

	}

}
