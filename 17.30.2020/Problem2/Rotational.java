package Java.Problem2;

public class Rotational{

    public static void ROT(int a, int[] b) {
        for(int i = 1; i <= a; i++) {
            // stores the last value of the array
            int t = b[b.length - 1];
            for(int j = 4; j >= 1; j--) {
                // move all integers forward by 1 except for the 1st (index 0)
                b[j] = b[j-1];
            }
            // changes the integer at index 0 with the old last stored value
            b[0] = t;
        }
    }
}