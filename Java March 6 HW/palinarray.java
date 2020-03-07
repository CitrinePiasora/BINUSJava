import java.util.*;

public class palinarray {
    
    public static void main(String args[]) {
        int x[] = {10, 20, 20, 10};
        int newarr[] = new int[x.length];
        for(int i = 0; i < x.length; i++) {
            newarr[i] = x[x.length - 1 - i];
        }
        
        if(Arrays.toString(x).equals(Arrays.toString(newarr))) {
            System.out.println("The array backwards is the same");
        } else {
            System.out.println("The array backwards is not the same");
        }
        }
    }