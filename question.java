import java.sql.SQLOutput;
import java.util.Scanner;

public class question {

    public static void reverse(int arr[],int start, int end){
        int temp = 0;
        while(start<end){
            temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void leftrot(int arr[],int n, int k){
        reverse(arr,0,k);
        reverse(arr,k+1,n-1);
        reverse(arr,0,n-1);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        reverse(arr,0,k);
//        reverse(arr,k+1,n-1);
//        reverse(arr,0,n-1);
//
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
        leftrot(arr,n,k);
        
    }
}
