package Java.Problem2;

import java.util.*;

public class circular{
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        System.out.print("How many times do you want to rotate?: ");
        int rotations = sc.nextInt();

        Rotational.ROT(rotations, a);
        

        for(int i = 0; i <= 4; i++) {
            System.out.println(a[i]);
        }
        
        sc.close();;
  }
}
