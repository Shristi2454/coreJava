package data_type;

public class datatype {

	/*
	 * ----------------- Data Type ------------------
	 * 1) Proper data representation
	 * 2) proper memory allocation
	 * 3) proper operations to be perform
	 * 
	 * 
	 * #Types : 
	 * 1) primitive data type
	 *    a) byte = range from -128 to 128 eg: 23,50,56,12
	 *    b) short = eg: 562,767,874,222
	 *    c) int  = eg: 676788,234324 
	 *    d) long = eg: 234567567756765756,231231232133
	 *    e) float = eg: 1.2, 4.6,7777.54545
	 *    f) double = eg: 21345545345.53453453
	 *    g) char = eg: 'M', '@'
	 *    h) boolean= eg: true/ false
	 *  
	 *  2) non primitive
	 *    a) String = eg: Ram, KTM, shristi@gmail.com
	 *    b) Array
	 *    c) Classes
	 *    d) Collection
	 *    
	 * 
	 */
	public static void main(String[] args) {
		long x= 5000000000000L;
		float k = 1.5f;
		System.out.println("byte = "+ Byte.SIZE + " bit" +"\nbyte min value= "+Byte.MIN_VALUE + "\nbyte maximum value= "+ Byte.MAX_VALUE);
		System.out.println("-------------------------------------------------");
		System.out.println("short = "+ Short.SIZE+ " bit" +"\nshort min value= "+Short.MIN_VALUE + "\nshort maximum value= "+ Short.MAX_VALUE);
		System.out.println("-------------------------------------------------");
		System.out.println("long ="+ Long.SIZE+ " bit" +"\nlong min value = " + Long.MIN_VALUE+"\nlong maximum value ="+ Long.MAX_VALUE);
		System.out.println("-------------------------------------------------");
		System.out.println("Double ="+ Double.SIZE+ " bit" + "\nDouble min value = " + Double.MIN_VALUE+"\nDouble maximum value ="+ Double.MAX_VALUE);
		System.out.println("-------------------------------------------------");
		System.out.println("Integer ="+ Integer.SIZE+ " bit" + "\nInteger min value = " + Integer.MIN_VALUE+"\nInteger maximum value ="+ Integer.MAX_VALUE);
		System.out.println("-------------------------------------------------");
		System.out.println("char ="+ Character.SIZE+ " bit" + "\nCharacter min value = " + Character.MIN_VALUE+"\nCharacter maximum value ="+ Character.MAX_VALUE);
		System.out.println("-------------------------------------------------");
		
	}
}
