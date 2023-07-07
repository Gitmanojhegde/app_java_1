package app_java_1;

	import java.util.Arrays;

	public class B {

	  public static void main(String[] args) {
	    int[] givenArray = {1,1,2,2,3,3,4,4,5,5,6,4,4,3,3,2,2,7,7,6,5,4,3,8,9,6};
	    int n = givenArray.length;

	    Arrays.sort( givenArray );

	    int j = 0;
	    int[] tempArray = new int[givenArray.length];
	    for (int i = 0; i < n-1; i++)
	    {
	        if (givenArray[i] != givenArray[i+1])
	        {
	           tempArray[j] = givenArray[i];
	           j++;
	        }
	    }
	    tempArray[j] = givenArray[n-1];

	    for (int i = 0; i <= j; i++)
	    {
	        System.out.print(tempArray[i] + " ");
	    }

	  }
	}

