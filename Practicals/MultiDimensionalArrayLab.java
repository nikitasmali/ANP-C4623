	import java.util.Scanner;

	public class MultiDimensionalArrayLab
	{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	      //Get the dimensions of the array from the user
	        System.out.print("Enter the number of rows: ");
	        int numRows = input.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int numCols = input.nextInt();

	        // Create 2-dimensional array 
	        int[][] array = new int[numRows][numCols];

	        System.out.println("\nEnter the elements of the array:");
	      //Get the values for the array from the user
	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < numCols; j++) {
	                array[i][j] = input.nextInt();
	            }
	        }

	        // Calculate the sum of each row of the array
	        System.out.println("\nThe sum of each row is:");
	        for (int i = 0; i < numRows; i++) {
	            int rowSum = 0;
	            for (int j = 0; j < numCols; j++) {
	                rowSum += array[i][j];
	            }
	            System.out.print(rowSum + " ");
	        }

	        // Calculate the sum of each column of the array
	        System.out.println("\n\nThe sum of each column is:");
	        for (int j = 0; j < numCols; j++) {
	            int colSum = 0;
	            for (int i = 0; i < numRows; i++) {
	                colSum += array[i][j];
	            }
	            System.out.print(colSum + " ");
	        }

	        input.close();
	    }
	}


