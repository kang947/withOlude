package withOlude;
import java.util.Arrays;
import java.util.Random;

public class Olude {

	
public static void main(String [] args){

 System.out.println("Hi Olude");	
 format("5142080522");	

 System.out.println("Hi Olude");
 
 System.out.println(randomDigitGenerator());
}

public static String randomDigitGenerator (){
	Random rand = new Random();
	
	int [] arrayChar = new int[10];
	
	for(int i =0; i<10; i++){
		arrayChar[i]= rand.nextInt(9)+1;
	}
	
	//putting arraychar into string
	String newString = "";
	for(int i = 0; i<10; i++) {
		newString += arrayChar[i];
	}
	
	return newString;
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


