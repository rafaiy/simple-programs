package string;

public class stringoperations {
	public static void main(String args[]){
		String s1= new String("hello");
		String s2= new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		String s="hello world";
		if(s1.equals(s2)){
			
			System.out.println(s1+s2);
						
		}
		System.out.println(s.indexOf("o"));
		System.out.println(s.substring(2, 5));
		System.out.println(s.charAt(s.indexOf("o")));
		System.out.println(s.compareTo(s2));
		System.out.println(s.lastIndexOf("o"));
		System.out.println(s.startsWith("hell"));
		
	}

}
