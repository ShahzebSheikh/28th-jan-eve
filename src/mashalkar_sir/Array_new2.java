package mashalkar_sir;

import java.util.Arrays;

public class Array_new2
{
public static void main(String[] args) 
{
	int[] numbers = new int[]{7,2,6,1,4,7,4,5,4,7,7,3,1};
	int temp = 0;

	System.out.print("Duplicates values: ");
	Arrays.sort(numbers);
	
	int previous = numbers[0] - 1;
    System.out.println(previous);
    int dupCount = 0;

    for (int i = 0; i < numbers.length; ++i) {
        if (numbers[i] == previous) {
            ++dupCount;
        } else {
            previous = numbers[i];
        }
    }
    System.out.println("There were " + dupCount + " duplicates in the array.");
}

}

