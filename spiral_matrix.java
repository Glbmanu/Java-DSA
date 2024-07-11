public class spiral_matrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while (startRow <= endRow && startCol <= endcol){
            //top
            for (int j = startCol; j<=endcol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // right
            for (int i = startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            // bottom
            for (int j = endcol-1; j>=startCol; j--){
                if (startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for (int i = endRow-1; i>=startRow; i--){
                if (startCol == endcol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startCol++;
            startRow++;
            endcol--;
            endRow--;
        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][]){    // O(n^2)
        int sum = 0;
        for(int i = 0; i< matrix.length; i++){
            for (int j = 0; j< matrix[0].length; j++){
                if(i == j){
                    sum +=matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }

        }
        return sum;
    }

    public static int ReduceDiagonalSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i< matrix.length; i++){
            // Primary Diagonal                              O(n) -- time complexity
            sum += matrix[i][i];
            // secondary diagonal
            if(i != matrix.length-1-i)
            sum += matrix[i][matrix.length-i-1];
        }
        return sum;
    }

    public static boolean stairCaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row< matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Found key at ("+ row +","+ col +")");
                return true;
            }

            else if (key <matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = { {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
      //  printSpiral(matrix);
      //  System.out.println(diagonalSum(matrix));
       // System.out.println(ReduceDiagonalSum(matrix));

        int key = 33;
        stairCaseSearch(matrix,key);
    }
}
