package pandy.test.sort;
/*
 * 插入排序
 */
import java.util.Arrays;

public class InsertSort {
	public static void insetSort(int arr[]) {
		int temp = 0;
		//外层循环 排序所有数字
		for(int i=0;i<arr.length;i++) {
			//内层循环 确定最小值得位置 然后进行交换
			for(int j=i-1;j>=0;j--) {
				if(arr[j+1]<arr[j]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				else {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {156,89,52,3,4656,65,654,6565,8};
 		InsertSort.insetSort(arr);
 		System.err.println(Arrays.toString(arr));
	}
}
