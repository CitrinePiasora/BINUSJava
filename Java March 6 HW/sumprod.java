public class sumprod {
    
    public static void main(String args[]) {
        int x[] = {1, 2, 3, 4, 5};
        int sum = 0, prod = 1;

            for(int i = 0; i < x.length; i++) {
                sum = sum + x[i];
                prod = prod * x[i];
            }

            System.out.format("Sum: %d\n", sum);
            System.out.format("Product: %d\n", prod);
        }
    }