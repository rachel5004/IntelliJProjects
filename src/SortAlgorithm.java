import java.util.Arrays;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] num = {1,10,5,8,7,6,4,3,2,9};

        // selection sort (O(N^2))
//        for (int i=0;i<num.length-1;i++){
//            for (int j=i+1;j<num.length;j++){
//                if(num[i]>num[j]){
//                    int tmp = num[i];
//                    num[i] = num[j];
//                    num[j] = tmp;
//                }
//            }
//        }
        // bubble sort (O(N^2))
//        for (int j=0;j< num.length-1;j++){
//            for (int i=0;i<num.length-1-j;i++){
//                if(num[i]>num[i+1]){
//                    int tmp = num[i];
//                    num[i] = num[i+1];
//                    num[i+1] = tmp;
//                }
//            }
//        }
        // insert sort (O(N^2))
//        for (int i=0;i< num.length-1;i++){
//            int j = i;
//            while (num[j]>num[j+1]){
//                int tmp = num[j+1];
//                num[j+1] = num[j];
//                num[j] = tmp;
//                j--;
//            }
//        }
         //Quick sort(분할정복) O(N*logN)
        QuickSort(num,0,num.length-1);
//        for (int i=0;i< num.length-1;i++){
//            int tmp = 0, tmp2 =0, tmp3;
//            for(int j=0;j<num.length-i-1;i++) {
//                if (num[i] < num[i + j]) tmp = num[i + j];
//                if (num[num.length - 1] > num[num.length - 1 - j])
//                    tmp2 = num[num.length - 1 - j];
//            }
//            if (Arrays.asList(num).indexOf(tmp)<Arrays.asList(num).indexOf(tmp2)){
//                tmp3 = tmp;
//                tmp = tmp2;
//                tmp2 = tmp;
//            }
//            else {
//                tmp3 = num[i];
//                num[i] = tmp2;
//                tmp2 = num[i];
//            }
//        }
        for (int i:num) System.out.print(i+" ");
    }
    static void QuickSort(int[] arr,int start,int end){
        if (start>= end) return;  //원소가 1개
        int pivot = start;
        int i = start + 1;   //왼쪽 출발지점
        int j = end;    //오른쪽 출발지점
        int tmp;
        while (i<=j){ //엇갈릴때까지 반복
            while(i<=end && arr[i] <= arr[pivot]) i++;   //기준보다 큰값
            while(arr[j] >= arr[pivot] && j>start) j--;  //기준보다 작은값
            if (i>j){
                tmp = arr[j];
                arr[j] = arr[pivot];
                arr[pivot] = tmp;
            }
            else{
                tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        QuickSort(arr,start,j-1);
        QuickSort(arr,j+1,end);

    }
}
