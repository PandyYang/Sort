package pandy.test.sort;
/*
 * 选择排序
 */
import java.util.Arrays;

public class ChooseSort {
	public static void sort(int arr[]) {
		int temp = 0;
		//第i趟排序
		for(int i=0;i<arr.length-1;i++) {
			//我为什么要给这里加1?
			int minIndex = i;
			//选取最小的记录
			for(int j=minIndex+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					//最小记录所在的位置
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {45,655,5,66,2626,266,22,2,23};
		ChooseSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
