package pandy.test.sort;

import java.util.Arrays;

/*
 * Ï£¶ûÅÅĞò
 */
public class ShellSort {
	/*
	 * public static void sort(int[] arr) { int num = arr.length/2; while(num>=1) {
	 * for(int i=0;i<arr.length;i++) { for(int j=i;j<arr.length-num;j=j+num) {
	 * if(arr[j]>arr[j+num]) { int temp = arr[j]; arr[j] = arr[j+num]; arr[j+num] =
	 * temp; } } } num = num/2; } }
	 */
	public static void sort(int arr[]) {
		int temp = 0;
		for(int num = arr.length/2;num>0;num/=2) {
			for(int i=num;i<arr.length;i++) {
				int j = i;
				while(j-num>0&&arr[j]<arr[j-num]) {
					temp = arr[j];
					arr[j] = arr[j-num];
					arr[j-num] = temp;
					j-=num;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1,0};
		ShellSort.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
