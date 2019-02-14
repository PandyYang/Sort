package pandy.test.sort2;

import java.util.Arrays;
/*
 * ѡ������
 */
public class ChooseSort {
	public static void chooseSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,6,4,1,8,9,7};
		ChooseSort.chooseSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
