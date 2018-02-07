import java.util.Arrays;
//Lingli Zou
//2/1/2017
//Lab 3.2

public class ArrayMethods2 {
	
	public static void main(String[] args)
	{
		String[] a = {"andy", "bapple", "cbanana", "dragon", "ending"};
		String[] b = {"aonuts", "bhips", "cvacado", "discuits", "eggs"};
		String[] total= merge(a,b);
		
		
		System.out.println(Arrays.toString(total));
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		//precondition: both list1 and list2 contains Strings in alphabetical order from a to z 
		int left=0; 
		int right=0; 
		int t=0;
		String[] total= new String[list1.length+list2.length];

		while(left<list1.length && right<list2.length)
		{
			if(list1[left].compareTo(list2[right])>=0)
			{
				total[t]=list2[right];
				right++;
				t++;
			}
			else if(list1[left].compareTo(list2[right])<0)
			{
				total[t]=list1[left];
				left++;
				t++;
			}
		}		
		
		while(left<list1.length)
		{
			total[t]=list1[left];
			left++;
			t++;
		}

		while(right<list2.length)
		{
			total[t]=list2[right];
			right++;
			t++;
		}
		
		return total;
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
