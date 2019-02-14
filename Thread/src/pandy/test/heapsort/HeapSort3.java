package pandy.test.heapsort;

import java.util.Arrays;

public class HeapSort3 {
	public static void main(String[] args) {
		int[] arr = {8,45,56,564,5,35,7896,2622,125,44512,265,233};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void heapSort(int[] arr) {
		//��������
		heapInsert(arr);
		int size = arr.length;
		while(size>0) {
			//�̶����ֵ
			swap(arr,0,size-1);
			size--;
			//��������
			heapify(arr,0,size);
		}		
	}
	//��������ͨ���²����������
	public static void heapInsert(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//��ǰ���������
			int currentIndex = i;
			//���ڵ������
			int fatherIndex = (currentIndex-1)/2;
			//�����ǰ�����ֵ�����丸�ڵ��ֵ
			//����ֵ ��������ָ�򸸽ڵ�
			//Ȼ�����������ĸ��ڵ���бȽ� ֱ��
			//�����ڸ��ڵ� ���˳�ѭ��
			while(arr[currentIndex]>arr[fatherIndex]) {
				//������ǰ�ڵ��븸�ڵ��ֵ
				swap(arr,currentIndex,fatherIndex);
				//����ǰ����ָ������
				currentIndex = fatherIndex;
				//���¼��㵱ǰ�����ĸ�����
				fatherIndex = (currentIndex-1)/2;
			}
		}
	}
	//��ʣ���������ɴ󶥶�
	public static void heapify(int[] arr,int index,int size) {
		int left = 2*index+1;
		int right = 2*index+2;
		while(left<size) {
			int largestIndex;
			//�жϺ����нϴ�ֵ������ Ҫȷ���Һ�����size��Χ��
			if(arr[left]<arr[right]&&right<size) {
				largestIndex = right;
			}else {
				largestIndex = left;
			}
			//�Ƚϸ��ڵ��е�ֵ�뺢���нϴ��ֵ ��ȷ�����ֵ������
			if(arr[index]>arr[largestIndex]) {
				largestIndex = index;
			}
			//������ڵ����������ֵ������ ���Ѿ��Ǵ���� �˳�ѭ��
			if(index==largestIndex) {
				break;
			}
			//���ڵ㲻�����ֵ �뺢���нϴ��ֵ����
			swap(arr,largestIndex,index);
			//������ָ�����нϴ�ֵ������
			index = largestIndex;
			//���¼��㽻����ĺ��ӵ�����
			left = 2*index+1;
			right = 2*index+2;
		}
	}
	//��������������Ԫ�ص�ֵ
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
