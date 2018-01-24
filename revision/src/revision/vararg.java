package revision;

public class vararg {
	public static int average(int...number){
		int sum =0;
		for(int x: number){
			sum +=x;
			
		}
		return sum/number.length;
	}

	public static void main(String[] args) {
		System.out.println(average(5,10,15));

	}

}
