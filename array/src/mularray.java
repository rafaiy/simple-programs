
public class mularray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]={{10,18,26,93},{34,54,23,76}};
		int arr2[][]={{10,23,34,25,24},{53,53,93},{34},{75,98}};
		
display(arr1);
System.out.println(" \n \n 2nd array is :");
display(arr2);
	}
public static void display(int a[][]){
	
	for(int row=0;row<a.length;row++){
		
	for(int col=0;col<a[row].length;col++){
		
		System.out.print("a[][] :"+a[row][col]+"\t ");
		
	}
	System.out.println();
		
	
	}
	
	
	
	
}
}
