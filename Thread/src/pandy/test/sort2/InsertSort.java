package pandy.test.sort2;

import java.util.Arrays;
/*
 *ֱ�Ӳ�������
 * 
 */
public class InsertSort {
	public static void insertSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}else {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {6,3,2,4,1,5,8,9,7};
		InsertSort.insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
