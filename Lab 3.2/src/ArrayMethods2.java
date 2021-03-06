import java.util.Arrays;
//Lingli Zou
//2/8/2018
//Lab 3.2

public class ArrayMethods2 {
	
	public static void main(String[] args)
	{
		//testing arrays
		String[] test1 = {"apple", "cucumber", "microsoft", "zorro"};
		String[] test2 = {"banana", "cherry", "mahogany", "oreos", "pinata"};
		int[] test3 = {3,4,2,7,1};
		
		//merge test
		long start= System.nanoTime();
		String[] mergeResult= merge(test1, test2);
		long end= System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took : " + time + " nanoseconds");
		System.out.println(Arrays.toString(mergeResult));
		
		start = System.nanoTime();
		int pivotFinalPos = partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took : " + time + " nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos); 
		System.out.println(Arrays.toString(test3));
		
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
		
		//returns an array of the two lists merged together
		return total;	
	}
	
	public static int partition(int[] list)
	{
		
		int temp;
		int pIndex=0; //the first element is the pivot
		int checkIndex=list.length-1; //checkIndex is the last number of the array
		
		while(pIndex != checkIndex)
		{
			if(pIndex < checkIndex)
			{
				if(list[pIndex] < list[checkIndex])
				{
					checkIndex--;
				}
			
				if(list[checkIndex] <= list[pIndex])
				{
					temp = list[pIndex];
					list[pIndex] = list[checkIndex];
					list[checkIndex] = temp;
					
					temp= checkIndex;
					checkIndex= pIndex;
					pIndex=temp;
					checkIndex++;
				}
			}
			
			else if(pIndex > checkIndex)
			{
				if(list[pIndex] > list[checkIndex])
				{
					checkIndex++;
				}
			
				if(list[checkIndex] > list[pIndex])
				{
					temp = list[checkIndex];
					list[checkIndex] = list[pIndex];
					list[pIndex] = temp;
					
					temp=pIndex;
					pIndex= checkIndex;
					checkIndex=temp;
					checkIndex--;
					
				}
			}
		
	}		   
		//return the integer position of the pivot in the newly partitioned array
		return pIndex;

	}
}

