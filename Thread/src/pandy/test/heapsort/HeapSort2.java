package pandy.test.heapsort;

public class HeapSort2 {
    int[] arr;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HeapSort2 heapSor = new HeapSort2();
        int[] arr = {7,23,45,9,40,73,12,49};  //0�±�ŵ������鳤�ȣ�
        heapSor.arr = arr;
        heapSor.heapSort(arr);
         
        for(int i=0;i<arr.length;i++)
            System.out.print(".."+arr[i]);
    }
    void heapAdjust(int[] arr,int s,int m){
        //��֪arr[s...m]�м�¼�Ĺؼ��ֳ�arr[s]֮�������ѵĶ��壬����������arr[s]�Ĺؼ��֣�ʹarr[s...m]��Ϊһ������
        int rc = arr[s]; //s�����һ����Ҷ�ӽڵ�
         
        for(int j=2*s;j <= m;j = s*2){
            if(j<m && arr[j]<arr[j+1])
                j++;  //jΪkey�ϴ���±�
            if(rc >= arr[j]) break;
             arr[s] = arr[j];  //���Ƶ����ڵ�
             s=j;
        }
        arr[s]=rc;  //Ҫ�����λ��
         
    }
     
    void heapSort(int[] arr){
        //��������н��Ѳ��������Ǵ����һ����Ҷ������ɸѡ�Ĺ���
        for(int i=(arr.length-1)/2;i > 0;i--){//��Ϊ0û��ʹ�ã�����length-1
            heapAdjust(arr,i,arr.length-1); 
        }
        System.out.println("........�������.............");
         
        outputArr(1);
        for(int i=arr.length-1; i>1; i--){
            int temp = arr[1];
            arr[1] = arr[i];
            arr[i] = temp;
            heapAdjust(arr,1,i-1);
        }
    }
    void outputArr(int i){
         
        if(i <= arr[0]){
            System.out.println(arr[i]);
            outputArr(i*2);  //��
            outputArr(i*2+1);  //��
        }
    }
}