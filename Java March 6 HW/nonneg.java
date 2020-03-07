public class nonneg{
    public static void main(String[] args){
        int[] a = {4,8,6,3,2};
        int[] b = new int[a.length+1];
        int highest = a[0];
        int second_highest = a[0];
        int j = 0; // position of the value to be split

        // find the highest value
        for(int i = 0; i < a.length; i++){
            if(a[i] > highest){
                highest = a[i];
                j = i;
            }
        }
        
        // find the second highest value
        for(int i = 0; i < a.length; i++){
            if(a[i] < highest && a[i] > second_highest){
                second_highest = a[i];
            }
        }

        // copy the values before the highest
        for(int i = 0; i < j; i++){
            b[i] = a[i];
        }

        b[j] = second_highest; // sets the next value to the 2nd highest
        b[j+1] = highest - second_highest; // sets the value after to the number needed to add to get the highest

        // adds the last part of the old array behind
        for(int i = j + 2; i < b.length; i++){
            b[i] = a[i-1];
        }

        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
  }
}