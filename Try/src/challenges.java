import java.util.Random;

public class challenges {

	public static void main(String[] args)
	{	
		//checks challengeOne
		int[] arr1 = createArray(10000);
		double median = challengeOne(arr1);
		System.out.println("median: " + median);
		
		//checks challengeTwo
			//stack overflow error
		String[] arr2 = {"hey", "hi", "bye"};
		int index = challengeTwo(arr2, "bye");
		System.out.println("index of string: " + index);
		
	}
	
	//this function sorts the array and returns the median
	public static double challengeOne(int[] arr)
	{
		printIntArray(arr);
		SortUtilities.quickSort(arr, 0, arr.length-1);
		printIntArray(arr);
		return findMedian(arr);
	}
	
	//this function sorts the list and if it finds the string, return the index of the string 
	public static int challengeTwo(String[] arr, String query)
	{
		printStringArray(arr);
		SortUtilities.bubbleSort(arr);
		printStringArray(arr);
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].equals(query))
			{
				return i;
			}
		}
		return -1;
	}
	
	//this function sorts a mostly sorted list and returns the median 
	public static double challengeThree(int[] arr)
	{
		return challengeOne(arr);
	}
	
	//this function sorts the sub arrays first, then the arrays by the median value, returns index of the median
	public static double challengeFour(int[][] arr)
	{
		int[] arr2 = new int[arr.length];
		for (int i = 0; i<arr.length; i++)
		{
			SortUtilities.quickSort(arr[i], 0, arr[i].length);
			
			arr2[i] = (int) findMedian(arr[i]);
		}
		SortUtilities.quickSort(arr2, 0, arr2.length);
		
		return findMedian(arr2);
	}
	
	//this function sort an array of any objects and sees if it contains the element given. returns position or -1
	public static int challengeFive(Comparable[]arr, Comparable query)
	{
		return -1;
	}
	
	//this function finds the median of the array
	public static double findMedian(int[] arr)
	{
		double middle = 0.0;
		if (arr.length%2 == 0)
		{
			middle = (double)(arr[arr.length/2] + arr[(arr.length/2) - 1])/2;
		}
		else
		{
			middle = (double)arr[arr.length/2-1];
		}
		return middle;
	}
	
	//creates a random array of integers
	public static int[] createArray(int n)
	{
		Random rnd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextInt(10000);
		}
		return arr;
	}
	
	//creates a random 5 character string
	public static String createRandomString()
	{
		return "hello";
	}
	
	//prints each number in the array
	public static void printIntArray(int[] arr)
	{
		for (int num : arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	//prints each string in the array
	public static void printStringArray(String[] arr)
	{
		for (String str : arr)
		{
			System.out.print(str + " ");
		}
		System.out.println();
	}
}
