
public class apple {

	
	public static void main(String[] args) {
		food f[]=new food[3];
f[0]=new orange();
f[1]=new dinner();
f[2]=new food();

animal a = new animal();
human d = new human();
a.digest(f[1]);


for(food x : f){
	
	System.out.println("enhanced for loop");
	x.eat();
	
}
	}

}
