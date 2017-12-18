package withOlude;
import java.util.Arrays;
import java.util.Random;

public class Olude {

	
public static void main(String [] args){
 System.out.println("Hi Olude");
 
 System.out.println(randomDigitGenerator());
}

public static String randomDigitGenerator (){
	Random rand = new Random();
	
	int [] arrayChar = new int[10];
	
	for(int i =0; i<10; i++){
		arrayChar[i]= rand.nextInt(9)+1;
	}
	
	String n = Arrays.toString(arrayChar);	
	return n;
}

public void test(){
	System.out.println("Hi Buyoung");
}
	
}


