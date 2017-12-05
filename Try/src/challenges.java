import java.util.Random;

public class challenges {

	public static void main(String[] args)
	{
		int[] arr = createArray(10);
		printArray(arr);
		int median = challengeOne(arr);
		printArray(arr);
		System.out.println("median: " + median);
	}
	
	//this function sorts the array and returns the median
	public static int challengeOne(int[] arr)
	{
		SortUtilities.quickSort(arr, 0, arr.length-1);
		return findMedian(arr);
	}
	
	//this function sorts the list and if it finds the string, return the index of ot
	public static int challengeTwo(String[] arr, String str)
	{
		
	}
	
	//this function finds the median of the array
	public static int findMedian(int[] arr)
	{
		int middle = 0;
		if (arr.length%2 == 0)
		{
			middle = arr[(arr.length/2 + (arr.length/2 - 1))/2];
		}
		else
		{
			middle = arr[arr.length/2-1];
		}
		return middle;
	}
	
	public static int[] createArray(int n)
	{
		Random rnd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextInt(10);
		}
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		for (int num : arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
