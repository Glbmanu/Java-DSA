import javax.swing.*;
import java.util.*;
public class Array {
    public static int linearSearch(int numbers[],int key){
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int largest_num(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i<numbers.length; i++){
            if (largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is :"+smallest);
        return largest;
    }

    public static int BinarySearch(int numbers[], int key){
        int start = 0,end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if (numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return - 1;
    }

    public static void reverse(int numbers[]){
        int first = 0,last= numbers.length-1;
        while (first<last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void print_pairs(int numbers[]){
        int tp = 0;
        for (int i = 0; i<numbers.length;i++){
            int curr = numbers[i]; // 2,4,6,8,10
            for (int j = i+1; j<numbers.length;j++){
                System.out.print("("+ curr + ","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs ="+tp);
    }

    public static void subarray(int numbers[]){
        int ts = 0;
        for (int i=0; i<numbers.length; i++){
            int start = i;
            for (int j = 1; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray = "+ts);
    }

    public static void maxsubArraySum(int numbers[]){

        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i<numbers.length; i++){
            int start = i;
            for (int j = 1; j<numbers.length; j++){
                int end = j;
              int currsum = 0;
                for (int k = start; k<=end; k++){
                    // print subarray sum
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = "+maxsum);
    }

    //Max subarray sum 2(Prefix sum)

    public static void maxsubArraySum2(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for (int i = 0; i<numbers.length; i++){
            int start = i;
            for (int j = 1; j<numbers.length; j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if (maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = "+maxsum);
    }

    // Max subarray sum 3 ( Kadane's Algorithm )


    public static void Kadanes(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < num.length; i++){
            cs = cs+num[i];
            ms = Math.max(cs,ms);
            if(cs < 0){
                cs = 0;
            }
        }
        System.out.println("Our max subarray sum is :"+ms);

    }

    public static void findeven(int num[]){
        int even = 0;
        int odd = 0;
        for (int i = 0; i<num.length;i++) {
        if ((num[i] % 2)==0) {
            even++;
            }
        else
            odd++;
        }
        System.out.println(even);
        System.out.println(odd);
    }


    public static int search(int num[],int key){
        for (int i = 0; i<num.length; i++){
            if (num[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void sor(int num[]){
        for (int i = 0; i<num.length; i++){
            for(int j = 0; j<num.length; j++){
                if (num[i]<num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] +" ");
        }

    }

    public static void dupli(int num[]){
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j <num.length ; j++) {
                if (num[i]==num[j]){
                System.out.println(num[i]);
            }
            }
        }
    }

    public static void rotate(int num[]){
        int a = 2;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Number before rotate"+num[i]);

        }

    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
    //    int key = 10;
    /*    int key = 10;
        int index = linearSearch(numbers,key);
        if (index == -1){
            System.out.println("not found");
        }else {
            System.out.println("Key is at index "+index);
        }
     */
     //   System.out.println("Largest value is :"+largest_num(numbers));
    //    System.out.println("Index for key is : "+ BinarySearch(numbers,key));
    /*    reverse(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
         */
       //print_pairs(numbers);
      //  subarray(numbers);
          maxsubArraySum(numbers);
     //  maxsubArraySum2(numbers);
      //
    //     int num[] = {-2,-3,4,-1,-2,1,5,-3};
      // int num[] = {-1};
      //  int num[] = {2,4,1,5,8,3,2,6,9};
       // int key = 8;
        //  Kadanes(num);
        //findeven(num);
   /*     int index = search(num,key);
        if (index == -1){
            System.out.println("not found");
        }else {
            System.out.println("Key is at index "+index);
        }
    */
        // sor(num);
      //  dupli(num);
      //  rotate(num);

    }
}
