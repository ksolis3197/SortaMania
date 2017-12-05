import java.util.Random;

public class tryit {

    public static void main(String args[])
    {        

        median(6);
    }
    
    
	public static void median(int i)
	{
		int sum = 0;
		for(int x = 0; x<=i; x++)
		{
			sum++;
			
		}
	}
	public static int[] createMArray(int n)
	{
		Random rnd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextInt(10);
		}
		return arr;
	}


}

 class MostSortInsertion
{

		void sort(int arr[])
		{
			int n = arr.length;
			for (int i=1; i<n; ++i)
			{
				int key = arr[i];
				int j = i-1;

				// 2 counters are running with one ahead of the previous one
				while (j>=0 && arr[j] > key)
				{
					arr[j+1] = arr[j];
					j = j-1;
				}
				arr[j+1] = key;
			}
		}

		// Printing 
		static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i] + " ");

			System.out.println();
		}

		// Main method
		public static void main(String args[])
		{	 
			int arr[] = {12, 11, 13, 5, 6};
			
			//keeps the code reiterating through the array
			//array are set to null by declaring them an object
			MostSortInsertion ob = new MostSortInsertion();	 
			ob.sort(arr);
			
			printArray(arr);
		}
	}	

