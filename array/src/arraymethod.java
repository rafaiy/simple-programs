
public class arraymethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,3,6,4,4,5,4};
		change(a);
		
			System.out.println("\n a:\t"+a);
		

	}
public static void change(int x[]){
	System.out.println("b\t x[]");
	for(int b :x){
		x[b]+=1000;
		System.out.println(b+"\t"+x[b]);
	}
	
	
}
}
