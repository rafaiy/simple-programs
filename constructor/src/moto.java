
public class moto {
private String name;
private dateconstructor date1;

public moto (String n,dateconstructor d){
	name=n;
date1 = d;
	
	
System.out.printf("%s",this);
}
public String toString(){
	return String.format("the name you gave is %s and the date is %s",name,date1);
	
	
}

}
