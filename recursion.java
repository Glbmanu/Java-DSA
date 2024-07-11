public class recursion {
    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n);
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        printInc(n-1);
        System.out.print(n);
    }
    public static int fact(int n){
        if (n==0) {
            return 1;
        }
            return n * fact(n-1);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static int fibo(int n){    // calculate nth term in fibonacci
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    // check array is sorted or not
    public static boolean issorted(int arr[], int i){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }

    // find first occurence of an array
    public static int firstoccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }

    public static int lastoccurence(int arr[],int key,int i){
        if (i== arr.length){
            return -1;
        }
        int isfound = lastoccurence(arr, key, i+1);
        if (isfound == -1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    // print x^n
    public static int pow(int x , int n){
        if (n==0){
            return 1;
        }
        return x * pow(x,n-1);
    }

// remove duplicate in string
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar-'a']==true){
            //duplicate
            removeDuplicate(str,idx+1,newStr,map);
        }else{
            map[currchar-'a']= true;
            removeDuplicate(str,idx+1,newStr.append(currchar),map);
        }
    }

    // binary string problem == print all binary string of size n without consecutive ones 01010101

    public static void printbinarystring(int n , int lastplace, String str){
       if(n==0) {
           System.out.println(str);
           return;
       }
        printbinarystring(n-1,0,str+"0");
       if(lastplace == 0){
           printbinarystring(n-1,1,str+"1");
       }
    }

    public static void main(String[] args) {
         //  printDec(10);
         //  printInc(10);
         //  System.out.println(fact(5));
         //  System.out.println(sum(6));
         //  System.out.println(fibo(5));
         //  int arr[]= {1,2,3,4};
         //  System.out.println(issorted(arr,0));
         //  int arr[]={8,3,6,9,5,10,2,5,3};
         //  System.out.println(firstoccurence(arr,5,0));
         //  System.out.println(lastoccurence(arr,5,0));
         //  System.out.println(pow(2,10));
       // String str = "appnacollege";
        //removeDuplicate(str,0,new StringBuilder(""), new boolean[26]);
       // printbinarystring(3,0,"");
    }
}
