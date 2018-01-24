package practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CandidateCode {
   /*
    * Complete the function below.
   */
//======================================================================================
public static int possibleways(int[] input1){
	int lastelement ,x,y,z,total=0;
	
	for( x = 0; x < input1.length; x++){
		for( y = x; y >= 0; y--){
			do{lastelement = input1[x];
			}while(false);
			System.out.println("lastelement: "+lastelement);
			for(z = 0;z<=y;z++){			
			total += input1[x-z] * lastelement;		
			System.out.println("total: "+total);
			}		
		}		
	}	
	 return (int) (total%((Math.pow(10,9))+7));
	}
   
		
		
		

   











//======================================================================================
public static void main(String[] args) throws IOException{
       Scanner in = new Scanner(System.in);
       int output = 0;
       int ip1_size = 0;
       ip1_size = Integer.parseInt(in.nextLine().trim());
       int[] ip1 = new int[ip1_size];
       int ip1_item;
       for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
           ip1_item = Integer.parseInt(in.nextLine().trim());
           ip1[ip1_i] = ip1_item;
       }
       output = possibleways(ip1);
       System.out.println(String.valueOf(output));
   }
}
