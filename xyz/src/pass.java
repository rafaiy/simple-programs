
public class pass {
	private String getname;
	 public pass(String name){
	 getname=name; 
		 }
	 private String passvalue(){
		 
		 return getname;
		
	 }
	 
	 public void message(){
		 System.out.printf("The given name is %s",passvalue());
		 
		 
		 
	 }

}
