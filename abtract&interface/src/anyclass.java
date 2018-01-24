

interface i1{
abstract void m1();
	void m2();
	void m3();
	}
 abstract class anyclass implements i1 {
	
public void m1(){
	
	System.out.println("m1 method ");
	
}
public void m2(){
	
	System.out.println("m2 method ");
	
}

	}
 class ext extends anyclass{
	 
	 void m4(){
		 System.out.println("extends method m3");
		 
	 }
	 public void m3(){
			System.out.println("m3 method");
		}
	 
 }
 
