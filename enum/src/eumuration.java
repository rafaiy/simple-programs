
public enum eumuration {
rafaiy("engineer","19"),
wajeeha("player","13"),
ghazala("wife","54"),
zafar("doctor","54");

private final String  information ;
private final String dob;

eumuration(String info,String year){
	information =info;
	dob = year;
}
public String geti(){
	return information;
}
public String gety(){
	return dob;
}
}
