import java.util.Formatter;
import java.util.*;
import java.io.*;
import java.lang.*;



public class filex {
	private Formatter x;
	private Scanner y;
	private String n,a,d;
	public void createfile(){
		
	try {
		 x = new Formatter("C:\\Users\\Rafaiy Rehman\\Desktop\\data.txt");
	}
	catch(Exception e){
		System.out.println("oops you get an eroor ");
	}
}
	public void readfile(){
		
	try{	y = new Scanner(new File("C:\\Users\\Rafaiy Rehman\\Desktop\\data.txt"));
		
	}
	catch(Exception error){
		System.out.println("you got an error");
		}
	}
	public void outputfile(){
		while(y.hasNext()){
			String name = y.next();
			String age = y.next();
			String DOB = y.next();
			System.out.println(name+" "+age+" "+DOB);	
			
		}
	}
		public void writefile(String name, String age, String DOB){
			
			
			x.format("%s%s%s",name , age , DOB  );
		
		
	}
	
	
	

	public void closefile(){
		x.close();
		
		
		
		
	}
}
