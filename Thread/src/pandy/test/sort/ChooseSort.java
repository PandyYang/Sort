package pandy.test.sort;
/*
 * ѡ������
 */
import java.util.Arrays;

public class ChooseSort {
	public static void sort(int arr[]) {
		int temp = 0;
		//��i������
		for(int i=0;i<arr.length-1;i++) {
			//��ΪʲôҪ�������1?
			int minIndex = i;
			//ѡȡ��С�ļ�¼
			for(int j=minIndex+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					//��С��¼���ڵ�λ��
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
