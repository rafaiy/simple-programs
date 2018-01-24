package codechf;

import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[1000000];
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++){
		
			Scanner scc=new Scanner(System.in);
			 ar[i]=scc.nextInt();	
			}
		
		for(int j=0;j<n;j++){			
			for(int k=j;k<n;k++){
				if(ar[k]<ar[j]){
					int temp = ar[k];
					ar[k]=ar[j];
					ar[j]=temp;
					
				}
				
			}		
			
		}
		for(int pr=0;pr<n;pr++){
			
			System.out.println(ar[pr]);
			
		}
			
			

	}

}
