package pandy.test.sort;
/*
 * ��������
 */
import java.util.Arrays;

public class InsertSort {
	public static void insetSort(int arr[]) {
		int temp = 0;
		//���ѭ�� ������������
		for(int i=0;i<arr.length;i++) {
			//�ڲ�ѭ�� ȷ����Сֵ��λ�� Ȼ����н���
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
