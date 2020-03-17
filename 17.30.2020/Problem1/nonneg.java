package Java.Problem1;

public class nonneg{
    public static void main(String[] args){
        int[] a = {4,8,6,3,2};
        int[] b = new int[a.length+1]; 


        if(nonnegutil.NegativeCk(a)) {

            // position of the highest value to be split into 2 components
            int j = nonnegutil.MaxVal(a); 
            // stores the highest value
            int highest = a[j];
            // stores the second highest value
            int second_highest = nonnegutil.SecMax(a, highest);
            // creates the output array
            nonnegutil.OutputArr(a, b, j, second_highest, highest);

            for(int i = 0; i < b.length; i++){
                System.out.println(b[i]);
            }

        } else {
            System.out.println("Error, the array must not have negative values!");
        }
  }
}
