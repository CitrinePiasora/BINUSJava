package Java.Problem1;

public class nonnegutil{

    public static boolean NegativeCk(int[] a) {
        // function to check if the array contains a negative value
        for(int i = 0; i < a.length; i++) {
            if(a[i] < 0) {
                return false;
            }
        }
        
        return true;
    }

    public static int MaxVal(int[] a) {
        // temporary variable to find the highest value in array
        int highest = a[0];
        int highest_index = 0;

        for(int i = 0; i < a.length; i++){
            // finds the index of the highest value
            if(a[i] > highest){
                highest = a[i];
                highest_index = i;
            }
        }
        return highest_index;
    }

    public static int SecMax(int[] a, int highest) {
        // function to find the second highest value
        int second_highest = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] < highest && a[i] > second_highest){
                second_highest = a[i];
            }
        }

        return second_highest;
    }

    public static void OutputArr(int[] a, int [] b, int j, int second_highest, int highest) {
        // copy the values before the highest into the new array
        for(int i = 0; i < j; i++){
            b[i] = a[i];
        }

        b[j] = second_highest; // sets the next value to the 2nd highest
        b[j+1] = highest - second_highest; // sets the value after to the number needed to add to get the highest

        // adds the last part of the old array behind it
        for(int i = j + 2; i < b.length; i++){
            b[i] = a[i-1];
        }
    }
}