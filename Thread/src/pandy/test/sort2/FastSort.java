package pandy.test.sort2;

import java.util.Arrays;
/**
 * ¿ìËÙÅÅĞò
 * @author Pandy
 *
 */
public class FastSort {
	public static void fastSort(int[] arr,int low,int high) {
		int start = low;
		int end = high;
		int key = arr[low];
		while(end>start) {
			while(end>start&&arr[end]>=key) 
				end--;
			if(arr[end]<=key) {
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
			}
			while(end>start&&arr[start]<=key)
				start++;
			if(arr[start]>=key) {
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
			}
			if(start>low) fastSort(arr, low, start-1);
			if(end<high) fastSort(arr, end+1, high);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,5,6,3,8,9,7,4};
		FastSort.fastSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
