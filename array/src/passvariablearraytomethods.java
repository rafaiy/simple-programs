
public class passvariablearraytomethods {
public static void main(String args[]){
	
	System.out.println("average is "+avg(10,10,10,10));
	
	
}
public static int avg(int...arr){

int sum=0;
for(int a:arr)
	{sum+=a;
	System.out.print("sum is :"+sum+"\nnow ");
	
} 
return sum/arr.length;
}

}
