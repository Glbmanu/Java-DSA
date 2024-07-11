public class BitManipulation {
    public static void oddEven(int n){
        int bitmask = 1;
        if ((n&bitmask)==0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static int getithbit(int n,int i){
        int bitmask = 1<<i;
        if ((n&bitmask)==0){
            return 0;
        } else {
            return 1;
        }
    }
    public static int setithbit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearithbit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateithbit(int n, int i, int newbit){
        if (newbit==0){
            return clearithbit(n,i);
        } else {
            return setithbit(n,i);
        }
    }

    public static int clearibits(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static int clearBitsinRange(int n,int i,int j){
        int  a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean ispoweroftwo(int n){
        return (n&(n-1))==0;
    }

    public static int countsetbits(int n){
        int count = 0;
        while(n>0){
            if ((n & 1)!= 0){  // check our lsb
                count ++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastexpo(int a , int n){
        int ans = 1;
        while (n>0){
            if ((n & 1) !=0){     // check lsb
                ans = ans * a;
            }
            a = a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {

   /*     System.out.println(5&6);   // and
        System.out.println(5|6);   // or
        System.out.println(~5);     // complement
        System.out.println(5^2);    // xor
        System.out.println(6<<2);   // a*2^b   left shift
        System.out.println(5>>1);   // a/2^b    right shift
    */
         //  oddEven(5);
        // oddEven(4);
        // System.out.println(getithbit(10,3));
        // System.out.println(setithbit(10,2));
        // System.out.println(clearithbit(10,1));
        //   System.out.println(clearibits(15,2));
      //  System.out.println(clearBitsinRange(10,2,4));

          //  Q-2 -- check if number is a power of 2 or not
     //   System.out.println(ispoweroftwo(8));
       // System.out.println(ispoweroftwo(15));

        // Q2 - count set bits in a number.... means how many time 1 occur
        //  System.out.println(countsetbits(15));

        System.out.println(fastexpo(5,3));

        // uppercase to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println((char)(ch | ' '));
        }

    }
}
