package array;

import java.util.Arrays;

public class ArrayasReturnType {
	public static void main(String[] args) {
		//int [] data = getArray();
		//System.out.println(Arrays.toString(data));
//		String[] city= getCities();
//		System.out.println(Arrays.toString(city));
		
		System.out.println(Arrays.toString(getCities()));
		
		System.out.println(Arrays.toString(getOddNumFrom1to100()));
	}
	//array as return type
	static int[] getArray() {
		
		int value[]= {2,3,4,5,6,7,8,9,0,54,32};
		
		return value;
	}
	
	static String[] getCities(){
		
		String data[]= {"Kathmandu ", "Chitwan", "Bhairahawa", "Birgunj", "Lumbini"};
		return data;
		
	}
	
	static int[] getOddNumFrom1to100() {
		
		int oddnum[]= new int [50];
		int j=0;
		
		for(int i= 1; i<=100; i++) {
			
			if (i%2!=0) {
				
			oddnum[j]=i;
			j++;
			}
		}
		return oddnum;
		
		
	}

}
