package mashalkar_sir;

import java.util.Arrays;

public class array_new 
{
	public static void main(String[] args) {
		
	int[] numbers = new int[]{7,2,6,1,4,7,4,5,4,7,7,3,1};
	int temp = 0;

	System.out.print("Duplicates values: ");
	Arrays.sort(numbers);
	
	int numDup = 0, dupCount = 0;
	int previous = -1;
	for (int i=0; i < numbers.length; ++i) 
	{
	    if (numbers[i] == previous) 
	    {
	        ++numDup;
	        if (numDup == 1) 
	        {
	            ++dupCount;
	            if (dupCount == 1) 
	            {
	                System.out.print(numbers[i]);
	            }
	            else 
	            {
	                System.out.print(", " + numbers[i]);
	            }
	        }
	    }
	    else 
	    {
	        previous = numbers[i];
	        numDup = 0;
	    }
	}

	System.out.println("\nNumber of duplicates values: " + dupCount);
	}
}
