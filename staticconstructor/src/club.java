
public class club {
private String name;
private String city;
private static int counter=0;
 
public club(String n,String c){
	name = n;
	city = c;
	counter++;	
	System.out.printf("the value of counter is: %s\n ",counter);
	System.out.printf("the name is: %s\nthe city is %s",name,city);
	
}
public String setname(){
	return name;
}
public String setcity(){
	return city;
}
public static int setcounter(){
	return counter;
		
	
}
}