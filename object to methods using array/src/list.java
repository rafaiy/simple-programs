public class list {

	public static animal a[]=new animal[5];
	 
	int i = 0;
	 	 
	 
	public void add(animal ab){
	if(i < a.length){
		a[i]=ab;
		System.out.println("index is added i.e " + i);
		i++;
	}
	
	 }
	
	
}
