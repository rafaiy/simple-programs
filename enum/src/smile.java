
public class smile {


	public static void main(String[] args) {
		//eumuration any= new eumuration(); //no constructor in this 
		
		for(eumuration people:eumuration.values()){
			
			System.out.printf("people :%s\t,information : %s\t, age :%s\t \n\n",people,people.geti(),people.gety());
			
		}
		

	}

}
