package ch10;

public class lotto {
	public static void main(String[] args) {
		 int[] numbers = new int[7];
		    outer:
		    for (int i = 0; i < numbers.length; )
		       {
		        numbers[i] = (int)(Math.random() * 49) + 1;
		        for (int j = 0; j < i ; ++j)
		         {
		            if (numbers[j] == numbers[i])
		                continue outer;
		          }
		        ++i;
		         }  
		    java.util.Arrays.sort(numbers);
		    for (int i = 0; i < numbers.length; ++i)
		    System.out.print(numbers[i]+"\t");
		    }
	

}