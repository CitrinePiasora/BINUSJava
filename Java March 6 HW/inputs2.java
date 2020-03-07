import java.util.*;

public class inputs2 {
    
    public static void main(String args[]) {
        int x[] = new int[10];
        int loops = 0;
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        while(loops < 10){
            System.out.print("Enter a new number: " );
            
            if(sc.hasNextInt()){
                int num = sc.nextInt();

                x[loops] = num;
                loops++;
            } else {
                System.out.print("Please enter an integer!: ");
                sc.nextLine();
                int num = sc.nextInt();
                x[loops] = num;
                loops++;
            }
            sc.nextLine();
            }

            System.out.print("Please enter an integer to search: ");
            int search = sc.nextInt();

            for(int i = 0; i < x.length; i++) {
                if(x[i] == search) {
                    found = true;
                    break;
                } else {
                    found = false;
                    continue;
                }
            }
            
            if(found) {
                System.out.print("The integer is present in the array!");
            } else {
                System.out.print("The integer is not present in the array!");
            }

            sc.close();
        }
    }