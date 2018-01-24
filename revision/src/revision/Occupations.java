package revision;

public enum Occupations {
	papa("doctor", 40),
	baji("mbbs", 23),
	wajeeha("officer", 14),
	mummy("artist", 40);
	
	public final String ocu;
	public final int age;
	
	 Occupations(String ocu, int age){
		this.ocu= ocu;
		this.age=age;			
		
	}
	 public String geto(){
		 return this.ocu;
		 
	 }
	public int geta(){
		return this.age;
		
		
	}
	

}
