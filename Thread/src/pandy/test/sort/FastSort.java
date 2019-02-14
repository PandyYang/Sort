package pandy.test.sort;

import java.util.Arrays;

/*
 * ¿ìËÙÅÅĞò
 */
public class FastSort {
	public static void sort(int[] a,int low,int high) {
		int start = low;
		int end = high;
		int key = a[low];
		
		while(end>start) {
			while(end>start&&a[end]>=key) {
				end--;
			}
			if(a[end]<=key) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			while(end>start&&a[start]<=key) {
				start++;
			}
			if(a[start]>=key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			if(start>low) sort(a,low,start-1);
			if(end<high) sort(a,end+1,high);
		}
	}
	public static void main(String[] args) {
		int a[] = {4545,45454,555,656565,5656562,22,2654,56456,4565,6};
		FastSort.sort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
