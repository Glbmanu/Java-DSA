import java.util.*;
public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // preCompute
        int hash[]= new int[13];
        for(int i = 0; i<n; i++){
            hash[arr[i]] += 1;
        }
        int q;
        q = sc.nextInt();
        while(q-- != 0){
            int number = sc.nextInt();
            // fetch
            System.out.print(hash[number]+" ");
        }
      */

        // hashing for string

        String s = sc.next();

      /*  int hash[]=new int[26];
        for(int i = 0; i<s.length(); i++){
            hash[s.charAt(i)-'a']++;
        }
        int q = sc.nextInt();
        while(q-- != 0){
            char c;
            c = sc.next().charAt(0);
            //fetch
            System.out.print(hash[c-'a']+" ");
        }

       */

        // code if string contains both upper and lower case.
        int hash[]=new int[256];
        for(int i = 0; i<s.length(); i++){
            hash[s.charAt(i)]++;
        }
        int q = sc.nextInt();
        while(q-- != 0){
            char c;
            c = sc.next().charAt(0);
            //fetch
            System.out.print(hash[c]+" ");
        }


    }
}
