import java.util.*;
public class two_d_array {
    public static boolean search(int matrix[][],int key){
        for(int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i +","+j+")");
                    return true;
            }
        }
    }
        System.out.println("Key not found");
        return false;
    }

    public static void matLargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.print(largest+ " ");
        System.out.println();

    }
    public static void small(int matrix[][]){
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < matrix.length; i++){
        for (int j = 0; j < matrix[0].length; j++){
            if (smallest > matrix[i][j]){
                smallest = matrix[i][j];
            }
        }

    }
        System.out.print(smallest+ " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix [][]= new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        for(int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
     //  search(matrix,5);
        matLargest(matrix);
        small(matrix);
    }
}
