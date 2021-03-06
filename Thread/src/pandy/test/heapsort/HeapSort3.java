package pandy.test.heapsort;

import java.util.Arrays;

public class HeapSort3 {
	public static void main(String[] args) {
		int[] arr = {8,45,56,564,5,35,7896,2622,125,44512,265,233};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void heapSort(int[] arr) {
		//构造大根堆
		heapInsert(arr);
		int size = arr.length;
		while(size>0) {
			//固定最大值
			swap(arr,0,size-1);
			size--;
			//构造大根堆
			heapify(arr,0,size);
		}		
	}
	//构造大根堆通过新插入的数上升
	public static void heapInsert(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//当前插入的索引
			int currentIndex = i;
			//父节点的索引
			int fatherIndex = (currentIndex-1)/2;
			//如果当前插入的值大于其父节点的值
			//交换值 并将索引指向父节点
			//然后继续和上面的父节点进行比较 直到
			//不大于父节点 则退出循环
			while(arr[currentIndex]>arr[fatherIndex]) {
				//交换当前节点与父节点的值
				swap(arr,currentIndex,fatherIndex);
				//将当前索引指向父索引
				currentIndex = fatherIndex;
				//重新计算当前索引的父索引
				fatherIndex = (currentIndex-1)/2;
			}
		}
	}
	//将剩余的数构造成大顶堆
	public static void heapify(int[] arr,int index,int size) {
		int left = 2*index+1;
		int right = 2*index+2;
		while(left<size) {
			int largestIndex;
			//判断孩子中较大值的索引 要确保右孩子在size范围内
			if(arr[left]<arr[right]&&right<size) {
				largestIndex = right;
			}else {
				largestIndex = left;
			}
			//比较父节点中的值与孩子中较大的值 并确定最大值得索引
			if(arr[index]>arr[largestIndex]) {
				largestIndex = index;
			}
			//如果父节点索引是最大值的索引 那已经是大根堆 退出循环
			if(index==largestIndex) {
				break;
			}
			//父节点不是最大值 与孩子中较大的值交换
			swap(arr,largestIndex,index);
			//将索引指向孩子中较大值得索引
			index = largestIndex;
			//重新计算交换后的孩子的索引
			left = 2*index+1;
			right = 2*index+2;
		}
	}
	//交换数组中两个元素的值
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
