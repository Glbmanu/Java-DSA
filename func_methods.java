import java.util.*;

public class func_methods {
  /*  public static int printHelloWorld(){
        System.out.println("Hello world");
        System.out.println("hello ");
        return 3;
    }
    public static void main(String[] args) {
        printHelloWorld(); // this is func. call
    }

   */
 /*   public static int CalculateSum(int a, int b){  // parameters or formal parameter

        int sum = a+b;
        return sum;

    }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum =  CalculateSum(a,b);        // arguments or actual parameters
      System.out.println("Sum is :"+sum);
  }

  */
/*
public static int multiply(int a, int b) {
    int product = a * b;
    return product;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println(prod);
      //multiply(a,b);
       int pro =  multiply(10,4);
        System.out.println(pro);
    }
 */
    public static int factorial(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
  /*  public static int bincoeff(int n , int r){
        int fact_n= factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number:");
      int n = sc.nextInt();
      System.out.println("Enter the second number:");
      int r = sc.nextInt();
      System.out.println("Binomial Coefficient of these number is:");
      System.out.println(bincoeff(n,r));
  }
   */

/*    public static boolean isprime(int n) {
        if (n==2){
            return true;
        }

        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                 // isprime = false;
                // break;
                // return isprime;
                return false;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        System.out.println(isprime(5));
    }
    */

    //check prime number optimized
 /*  public static boolean isprime(int n) {
        if (n==2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimesInRange(int n){
       for (int i = 2; i <= n; i++){
           if (isprime(i)){ // true
               System.out.print(i+" ");
           }
       }
        System.out.println();
    }

    public static void main(String[] args) {
      //  System.out.println(isprime(5));
        PrimesInRange(20); // 2 to 20
    }
  */

    // convert from binary to decimal

/* public static void bintodec(int binNum){
    int mynum = binNum;
    int pow=0;
    int decNum = 0;
    while (binNum>0){
        int lastdigit = binNum%10;
        decNum=decNum+(lastdigit*(int)Math.pow(2,pow));
        pow++;
        binNum = binNum/10;
    }
    System.out.println("decimal of "+mynum+" ="+decNum);
}

    public static void main(String[] args) {
        bintodec(111);
    }
    */

    // Decimal to binary
/*    public static void dectobin(int n){
       int mynum =n;
       int pow = 0;
       int binnum = 0;
       while (n>0){
           int rem = n%2;
           binnum=binnum+(rem * (int)Math.pow(10,pow));
           pow++;
           n=n/2;
       }
        System.out.println("Binary form of "+mynum+"="+binnum);
    }
    public static void main(String[] args) {
        dectobin(5);
    }
 */



}
