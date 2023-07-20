import java.util.Scanner;

public class Matrix_product {
    public static void matrixProduct(int[][] matrix, int num){
        for(int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length; j++){
                matrix[i][j] *= num;
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();

        int mat[][]=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j = 0 ; j < col; j++) {

                mat[i][j] = scan.nextInt();
            }
        }
        int prd=scan.nextInt();
        matrixProduct(mat,prd);

    }
}
