package multiDimensionalArrays;

public class MultiDiArrays {

	public static void main(String[] args) {
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
	// We have Two pairs of square bracket so it indicate two dimension array
	// {1, 2, 3, 4} =[0];
	// {5, 6, 7}    =[1];
   // Array index in Java is Zero base means first element of array is 0

	    System.out.println(myNumbers[1][2]);  
// output =7
	    int[][] matrix = new int[3][5];
	    matrix[0][0] = 1;
	    matrix[1][3] = 7;
	    matrix[2][4] = 9;
	    System.out.println(myNumbers[1][2]);
	    //A jagged array, also known as an "array of arrays," is an array whose elements are arrays
	    int[][] jaggedArray = new int[3][];
	    jaggedArray[0] = new int[5];
	    jaggedArray[1] = new int[3];
	    jaggedArray[2] = new int[7];
/*This creates a jagged array with 3 elements,
  where the first element is an array of 5 integers,
  the second element is an array of 3 integers,
  and the third element is an array of 7 integers.*/
	   //We can not took empty two bracket
	}
}
