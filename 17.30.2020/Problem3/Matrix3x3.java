package Java.Problem3;

class Matrix3x3 {
    public static void main(String args[]) {
        int mat[][] = MatrixUtil.MatInitializer();
        int transposed[][] = MatrixUtil.Transposer(mat);

        if(MatrixUtil.SymCk(mat, transposed)) {
            System.out.print("The matrix is symmetrical");
        } else {
            System.out.print("The matrix is not symmetrical");
        }
    }
}
