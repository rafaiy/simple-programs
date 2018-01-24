
public class constrtime {
private int hour;
private int minute;
private int second;

public constrtime(){
	this (0,0,0);
	
}
public constrtime(int h){
	this (h,0,0);
	
}
public constrtime(int h,int m){
	this (h,m,0);
	
}

public constrtime(int h,int m,int s){
	settime(h,m,s);	
}

public void settime(int h,int m,int s){
	sethour(h);
	setminute(m);
	setsec(s);	
}
public void sethour(int h){
	 hour =(h>=0 && h<12 ? h:0);
}
public void setminute(int m){
minute=(m>=0 && m<60 ? m:0);
	
}
public void setsec(int s){
	
second =(s>=0 && s<60 ? s:0);
}
public int hour(){
	return hour;
	
}
public int minute(){
	return minute;
	
}
public int second(){
	return second;
	
}
public String givetime(){
	
	return String.format("%02d:%02d:%02d",hour(),minute(),second()); 
	}
}
