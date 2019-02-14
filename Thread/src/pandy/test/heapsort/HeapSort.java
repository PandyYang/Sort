package pandy.test.heapsort;

import java.util.Arrays;

/*
 * ¶ÑÅÅĞò
 */
public class HeapSort {
	public static void heapSort(int arr[]) {
		for(int i = arr.length/2;i>=0;i--) {
			heapAdjust(arr,i,arr.length);
		}
		for(int i=arr.length-1;i>0;i--) {
			swap(arr,0,i);
			heapAdjust(arr,0,i);
		}
	}
	private static void heapAdjust(int arr[],int i,int n) {
		int child = 0 ;
		int father;
		for(father = arr[i];leftChild(i)<n;i=child) {
			if(child!=n-1&&arr[child]<arr[child+1]) {
				child++;
			}
			if(father<arr[child]) {
				arr[i]=arr[child];
			}else {
				break;
			}
		}
		arr[i]=father;
	}
	private static int leftChild(int i) {
		return 2*i+1;
	}
	private static void swap(int[] arr,int index1,int index2) {
		int temp  = index2;
		index2 = index1;
		index1 = temp;
	}
	public static void main(String[] args) {
		int arr[]= {2,65,4,23,44,88,6,5,666,89};
		HeapSort.heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
