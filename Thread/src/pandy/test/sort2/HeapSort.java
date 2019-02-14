package pandy.test.sort2;

import java.util.Arrays;

public class HeapSort {
	public static void heapSort(int[] arr) {
		heapInsert(arr);
		int size =arr.length;
		while(size>0) {
			swap(arr,0,size-1);
			size--;
			heapify(arr, 0, size);
		}
	}
	public static void heapInsert(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int currentIndex = i;
			int fatherIndex = (currentIndex-1)/2;
			while(arr[currentIndex]>arr[fatherIndex]) {
				swap(arr,currentIndex,fatherIndex);
				fatherIndex = (currentIndex-1)/2;
			}
		}
	}
	public static void heapify(int[] arr,int index,int size) {
		int left = 2*index+1;
		int right = 2*index+2;
		while(left<size) {
			int largestIndex;
			if(arr[left]<arr[right]&&right<size) {
				largestIndex = right;
			}else {
				largestIndex = left;
			}
			if(arr[index]>arr[largestIndex]) {
				largestIndex = index;
			}
			if(index==largestIndex) {
				break;
			}
			swap(arr,largestIndex,index);
			index = largestIndex;
			left=2*index+1;
			right=2*index+2;
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {5,6,9,7,4,8,3,2,1};
		HeapSort.heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
