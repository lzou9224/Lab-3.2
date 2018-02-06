import java.util.Arrays;
//Lingli Zou
//2/1/2017
//Lab 3.2

public class ArrayMethods2 {
	
	public static void main(String[] args)
	{
		String[] a = {"cherry", "apple", "banana", "dragonfruit", "eggplant"};
		String[] b = {"donuts", "chips", "avacado", "biscuits", "eggs"};
		merge(a, b);
		
		int[] list= {5,3,8,6,1,9,2};
		System.out.println(Arrays.toString(a));
		
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		//precondition: both list1 and list2 contains Strings in alphabetical order from a to z 
		int x; int y;
		for(int a=0; a<list1.length; a++)
		{
			for(int b=0; b<list2.length; b++)
			{
				if(list1[a] <= list2[b])
				{
					
			}
		}

 
    }
		
		
		
		//Returns: An array of the two lists merged together. The result must be in alphabetical order.
	}
	
	public static int partition(int[] list)
	{
		
		//*Write a method that partitions a list using the first element as the pivot. You should return the
		//integer position of the pivot in the newly partitioned array. The original array should be rearranged so that
		//all the elements before the pivot are less than or equal to the pivot and all the elements after the pivot are
		//greater than the pivot.
		
		
	}
}
