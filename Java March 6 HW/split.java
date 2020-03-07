import java.util.*;

public class split {
    
    public static void main(String args[]) {
        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int half1[] = new int[x.length/2];
        int half2[] = new int [x.length/2];

        for(int i = 0; i < x.length/2; i++) {
            half1[i] = x[i];
        }

        for(int i = x.length/2, j = 0; i < x.length; i++, j++) {
            half2[j] = x[i];
        }

        System.out.println(Arrays.toString(half1));
        System.out.println(Arrays.toString(half2));
        }
    }