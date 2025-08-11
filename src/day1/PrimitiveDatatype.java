package day1;

public class PrimitiveDatatype {

	
public static void main(String args[]) {
	//integer
	int intmax=13423;
	int intmin=100;

	System.out.println("the max integer value:"+intmax+"the min integer value:"+intmin);
	
	//
	
     float amin=3733.342f;
     float amax=384344.33f;
	
    		 
    System.out.println("the max float value:"+amax+"the min float value:"+amin);
 	
    
    byte byteMax = 127;
	byte byteMin = -128;
	
	System.out.println("Min range of byte is" +
			byteMin+"Max range of byte is "+byteMax);
	
	//short - 2 bytes
	short shortMax = 32767;
	short shortMin = -32768;
	System.out.println("Minshort range of byte is" +
			shortMin+"Maxshort range of byte is "+shortMax);
	long maxLong = 9223372036854775807L;
	long minLong = -9223372036854775808L;
	
	System.out.println("Minlong range of byte is" +
			minLong+"Maxlong range of byte is "+maxLong);
	
	double d=3456.14124512345678902345678914f;
	System.out.println(" double value is "+d);
	
	//boolean 
	boolean flag=false;
	System.out.println("boolean value is "+flag);
}
}

