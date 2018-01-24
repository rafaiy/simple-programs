package revision;
import java.util.Random;
public class random {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] ar = new int[2];
		
		for(int i=0;i<1000;i++){
		Boolean b = ran.nextBoolean();
		if(b){
		++ar[0];
		
		}
		else{
		++ar[1];	
		}}
		System.out.println("value   times");
		System.out.println("true:\t"+ ar[0]+"\nfalse:\t"+ar[1]);
	}

}
