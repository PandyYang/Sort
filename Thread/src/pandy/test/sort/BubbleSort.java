package pandy.test.sort;
/*
 * 冒泡排序
 */
import java.util.Arrays;

public class BubbleSort {
	public static void sort(int arr[]) {
		int temp=0;//作为交换的标兵
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,55,63,684,522,3588,566,5656,565};
		BubbleSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
