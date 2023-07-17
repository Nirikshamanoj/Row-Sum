import java.util.Scanner;
public class RowSum {
    static void findRowSum(int[][] A,int row,int column)
    {
        for (int i=0;i<row;i++)
        {
            int sum=0;
            for (int j=0;j<column;j++)
            {
                sum+=A[i][j];
            }
            System.out.print(sum+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int A[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        findRowSum(A, row, column);
    }
}
