package arrays2;

import java.util.Arrays;

public class arrays2 {
	
	public static void main(String[]args){
		
		double[] doubleArray = {3.2,4.5,6.7,7.9,8.3};
		Arrays.sort(doubleArray);
		System.out.printf("%ndoubleArray");
		for (double value : doubleArray){
			System.out.printf("%.1f",value);
		}
		
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray,7);
		displayArray(filledIntArray,"filledIntArray");
		
		int[] intArray = {1,2,3,4,5,6};
		int[] intArrayCopy = new int[intArray.length];
		
		System.arraycopy(intArray, 0, intArrayCopy ,0 , intArray.length);
		displayArray(intArray,"intArray");
		displayArray(intArrayCopy,"intArrayCopy");
		
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("%n%nintArray %s intArrayCopy%n",
				(b ? "==" : "!="));
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray %s filledIntArray%n",
				(b ? "==" : "!="));	
		
	}
	public static void displayArray(int[] array, String description){
		System.out.printf("%n%s",description);
		for (int value : array){
			System.out.printf("%d",value);
		}
	}
}
