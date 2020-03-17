package Java.Problem3;
import java.util.*;

class MatrixUtil {

    public static int[][] MatInitializer() {
        int mat[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Enter Index" + "[" + i + "]" + "[" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        sc.close();
        return mat;
    }

    public static int[][] Transposer(int[][] mat) {
        int matT[][] = {{mat[0][0], mat[1][0], mat[2][0]}, {mat[0][1], mat[1][1], mat[2][1]}, {mat[0][2], mat[1][2], mat[2][2]}};
        return matT;
    }

    public static boolean SymCk(int[][] mat, int[][] transposed) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                if(mat[i][j] != transposed[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
