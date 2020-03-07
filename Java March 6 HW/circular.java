public class circular{
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5};
        int t = a[4];

        // move all integers forward by 1 except for the 1st (index 0)
        for(int i = 4; i >= 1; i--) {
            a[i] = a[i-1];
        }

        // changes the integer at index 0 with the old last stored value
        a[0] = t;

        for(int i = 0; i <= 4; i++) {
            System.out.println(a[i]);
        }
  }
}