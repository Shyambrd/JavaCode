package JavaPrograms;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get an array to sort
		
		int arr []=new int [] {-2,3,1,7,6,-9,4,0,8};
		
		System.out.println("The un sorted  array is :");
		showArray (arr);
		sortArray (arr);
	}

	public static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		
		// temp variable for swapping
		int temp = 0;
		for (int i =0; i< arr.length; i++)
		{
			for (int j =i+1; j< arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("The sorted array is :");
		showArray(arr);
	}

	public static void showArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i =0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " , ");
		}
		System.out.println();
	}

}
