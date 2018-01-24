
public class myclass {
	
	public static void main(String[] args) {
		
time tobj =new time();
System.out.println("Time Format is HH:MM:SS");
tobj.passtime(15,13,13);
System.out.println(tobj.timemilitary());
System.out.println("regular time format ");
System.out.println(tobj.normtime());
	}

}
