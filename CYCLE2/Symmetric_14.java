public class Symmetric_14 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 5, 4},
            {3, 4, 6}
        };

        if (isSymmetric(matrix)) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Not Symmetric");
        }
    }

   public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {  
                if (matrix[i][j] != matrix[j][i]) {
                    return false; 
                }
            }
        }
        return true; 
    }
}

    
    
