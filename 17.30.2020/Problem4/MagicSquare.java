package Java.Problem4;
import java.util.*;

class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order of the Magic Square: ");

        if(sc.hasNextInt()) {
            int n = sc.nextInt();

            if(n < 0) {
                System.out.println("Please enter a valid POSITIVE integer");
            } else if(n % 2 == 0) {
                int arr[][] = MagicSqrUtil.SquareCreate2(n);
                MagicSqrUtil.SquarePrint2(arr, n);
            } else {
                int arr[][] = MagicSqrUtil.SquareCreate(n);
                MagicSqrUtil.SquarePrint(arr, n);
            }
        } else {
            System.out.println("Please enter a valid integer");
        }

        

        sc.close();
    }
}
