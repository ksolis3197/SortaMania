
public class SortUtilities {

	//working int partition
	public static int partition(int[] list1, int front, int back)
	{
		//returns position of the pivot 
		int pivot = list1[front];
		int pivPosition = front;
		
		for (int i = front+1; i <= back; i++)
		{
			if (list1[i]<=pivot)
			{
				for (int j = 0; j<i-pivPosition; j++)
				{
					swap(list1,i-j,i-j-1);
				}
				pivPosition++;
			}
		}
		return pivPosition;
	}
	
	//working int quickSort
	public static void quickSort(int[] list1, int front, int back)
	{
		if (front < back)
		{
			int pivPosition = partition(list1, front, back);
			quickSort(list1,front,pivPosition-1);
			quickSort(list1,pivPosition+1,back);
		}
	}
	
	//int swap
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//string sort
	public static void bubbleSort(String[] list1)
	{
		for(int i = 0; i<list1.length-1; i++) 
		{
			if(list1[i+1].compareTo(list1[i]) <= 0)
			{
				swapS(list1,i,i+1);
				bubbleSort(list1);
			}
		}
	}
	
	//string swap
	public static void swapS(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
