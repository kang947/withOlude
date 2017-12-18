package withOlude;

public class Olude {

	
public static void main(String [] args){
 System.out.println("Hi Olude");	
 format("5142080522");	
}

public void test(){
	System.out.println("Hi Buyoung");
}

public static void format(String phoneNum){

if (phoneNum.length() != 10){
	System.out.println("Number not complete!!!");
}
else{
	String areaCode, zone, num;
	areaCode = phoneNum.substring(0,3);
	zone = phoneNum.substring(3,6);
	num = phoneNum.substring(5,10);

	System.out.println(areaCode+"-"+zone+"-"+num );

}



}
	
}


