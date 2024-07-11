public class Adv_pattern {
    public static void hollow_rectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void rev_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void num_pyramid(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOne_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void hollow_rhombus(int n ){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // hollow rectangle
            for (int j = 1; j <=n;j++){
                if (i ==1|| i==n|| j==1||j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void diamond(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        // 2nd half
        for(int i = n; i >= 1; i--){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }


   public static void yash(int n){
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(j==i || j==n-1+1){
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
   }

public static void palindromeWithNumber(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
        for (int j = i; j>=1; j--){
            System.out.print(j);
        }
        for (int j = 2; j<=i; j++){
            System.out.print(j);
        }
            System.out.println();
        }
    }

    public static void pat(int matrix[][]){
        int i,j;
        int N = 5;
        for(i = 1; i<=N; i++){
            for (j =i; j<= N; j++){
                if(i==1||j==i||j==N)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
        public static void main (String args[]){
              hollow_rectangle(4,5);
                rev_pyramid(5);
              num_pyramid(5);
           floyd_triangle(5);
                zeroOne_triangle(5);
                 butterfly_pattern(4);
                 rhombus(5);
            hollow_rhombus(5);
            diamond(4);
            palindromeWithNumber(5);
int[][] matrix = new  int[5][5];
//pat(matrix);

        }
    }
