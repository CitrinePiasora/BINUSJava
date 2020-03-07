import java.util.*;

public class inputs3 {
    
    public static void main(String args[]) {
        int x[] = new int[20];
        int loops = 0;
        Scanner sc = new Scanner(System.in);
        int posloop = 0, negloop = 0, oddloop = 0, evenloop = 0, zeroloop = 0;

        while(loops < 20){
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

            for(int i = 0; i < x.length; i++) {
                int check = x[i];
                if(check < 0) {
                    negloop++;
                } else if(check > 0) {
                    posloop++;
                }
            }

            for(int i = 0; i < x.length; i++) {
                int check = x[i];
                if(check % 2 == 0) {
                    evenloop++;
                } else if(check % 2 != 0) {
                    oddloop++;
                } else {
                    zeroloop++;
                }
            }

            System.out.println(negloop);
            System.out.println(posloop);
            System.out.println(evenloop);
            System.out.println(oddloop);
            System.out.println(zeroloop);

            sc.close();
        }
    }