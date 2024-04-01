import java.util.Scanner;
import java.util.Arrays;
public class Ex65 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
	    System.out.println("Input the length of the Array: ");
	    int n = N.nextInt();
	    System.out.println("Input each element's value: ");
		int[] arr = new int[n];
		double sum = 0;
		//Input array and calculate the sum
		for(int i=0;i<=n-1;++i) {
			int x = N.nextInt();
			arr[i] = x;
			sum+= x;
		}
		double average = sum/n;
		for (int i=0; i<= n-1;i++){
	        int idx = i;
	        for (int j=i;j<=n-1;j++){
	        	if (arr[j]<arr[idx]) idx =j;
	        }
	        int tmp = arr[i];
	        arr[i]= arr[idx];
	        arr[idx]= tmp;
	    }
		System.out.println("the array is "+Arrays.toString(arr)+ ", the sum is " + sum + " and the average value is " + average);

	}

}
