import java.util.*;

public class inputs {
    
    public static void main(String args[]) {
        int x[] = new int[10];
        int loops = 0;
        Scanner sc = new Scanner(System.in);

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
            System.out.print(Arrays.toString(x));
            sc.close();
        }
    }