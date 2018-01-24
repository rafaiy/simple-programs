package revision;

public class tostring2 {
private int month ;
private int day;
private int year;
public tostring2(int month, int day, int year){
	this.month = month;
	this.day = day;
	this.year = year;
	System.out.println("day/month/year"+ this);		
	
}

public String toString(){
	
	return String.format("%d/%d/%d",month,day,year);
	
}


}
