public class sum_row_col_15 {
    public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
            };
    
            int r = matrix.length;
            int c = matrix[0].length;
            System.out.println("Sum of Row and column ");
            
            for (int i = 0; i < r; i++) {
                int rowSum = 0;
                for (int j = 0; j < c; j++) {
                    rowSum += matrix[i][j];
                }
                System.out.println(" Row " + (i + 1) + ": " + rowSum);
            }
    
            
            for (int j = 0; j < c; j++) {
                int colSum = 0;
                for (int i = 0; i < r; i++) {
                    colSum += matrix[i][j];
                }
                System.out.println(" Column " + (j + 1) + ": " + colSum);
            }
        }
    }
    
    

