
public class dateconstructor {
private int day;
private int month;
private int year;

public dateconstructor(int d, int m, int y){
	day=d;
	month=m;
	year =y;
	System.out.printf("this is a constructor call and your date format is %s",this);
	}
public String toString(){
	
	return String.format("%d/%d/%d",day,month,year);
}

}
