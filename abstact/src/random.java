import java.util.Random;


public class random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int i,j,rno = 0,flag=1;
	Random r=new Random();
	
	int[] randomno=new int[15];
	
		for(i=0;i<15;i++){
			while(flag==1){
				flag=0;
		rno =r.nextInt(15)+1;
		for(j=0;j<i;j++)
			if(randomno[j]==rno){  flag=1;	break;}
		      	
		                }
			   flag=1;
		      randomno[i]= rno;	
		                }
		for(int a:randomno){
			
			System.out.println(a);
			
		}
	}
	}


