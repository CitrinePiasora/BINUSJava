package Java.Problem4;
  
class MagicSqrUtil { 
    // function for calculating Odd Order Magic Square
    static int[][] SquareCreate(int n) { 
        int[][] arr = new int[n][n]; 
          
        // (i, j) are the position on the square for a number
        // in an Odd Order MSquare, position of 1 is always
        // (n/2, n-1)
        int i = n/2; 
        int j = n-1; 
   
        // One by one put all values in magic square 
        for(int num = 1; num <= n*n;) { 

            // condition 1
            // if the calculated row = -1 & calculated column = n
            // wrap around to (0, n-2)
            if (i == -1 && j == n) { 
                j = n-2; 
                i = 0; 
            } else { 
                // condition 2 and its sub conditions
                // if the calculated column = n
                // wrap around to 0
                if (j == n) {
                    j = 0; 
                } 

                // if the calculated row < 0
                // wrap around to n - 1
                if (i < 0) {
                    i = n - 1;
                }
            } 
              
            // condition 3
            // if the calculated position is not empty
            // calculated row + 1, calculated column - 2
            if (arr[i][j] != 0) { 
                j -= 2; 
                i++; 
                continue; 
            } 
            else {
                //Set number 
                arr[i][j] = num;
                num++;
            }
                  
            // Position of next number is calculated by
            // incrementing the column no. and decrementing the row no. 
            j++;  i--;  
        }

        return arr;
    }

    // Function to print Odd Order Magic Square
    public static void SquarePrint(int[][] arr, int n) {
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < n; j++) 
                System.out.print(arr[i][j]+" "); 
            System.out.println(); 
        }
    }

    // Function for calculating Double Even Order Magic square 
    public static int[][] SquareCreate2(int n) { 
        int[][] arr = new int[n][n]; 
        int i, j; 
   
        // fill matrix with its count value  
        // starting from 1; 
        for(i = 0; i < n; i++) {
            for ( j = 0; j < n; j++) {
                arr[i][j] = (n*i) + j + 1;
            }
        } 
        
        // change value of element at fixed locations
        // using the rule (n*n+1) - arr[i][j] 


        // Top Left corner of Matrix  
        // (order = (n/4)*(n/4)) 
        for(i = 0; i < n/4; i++) {
            for(j = 0; j < n/4; j++) {
                arr[i][j] = (n*n + 1) - arr[i][j];
            }
        }

        // Top Right corner of Matrix  
        // (order = (n/4)*(n/4)) 
        for(i = 0; i < n/4; i++) {
            for(j = 3 * (n/4); j < n; j++) {
                arr[i][j] = (n*n + 1) - arr[i][j];
            }
        }
       
        // Bottom Left corner of Matrix 
        // (order = (n/4)*(n/4)) 
        for(i = 3 * n/4; i < n; i++) {
            for(j = 0; j < n/4; j++) {
                arr[i][j] = (n*n+1) - arr[i][j];
            }
        }          
      
        // Bottom Right corner of Matrix  
        // (order = (n/4)*(n/4)) 
        for (i = 3 * n/4; i < n; i++) {
            for ( j = 3 * n/4; j < n; j++) {
                arr[i][j] = (n*n + 1) - arr[i][j]; 
            }
        }        
     
        // Centre of Matrix
        // order = (n/2)*(n/2)) 
        for (i = n/4; i < 3 * n/4; i++) {
            for ( j = n/4; j < 3 * n/4; j++) {
                arr[i][j] = (n*n + 1) - arr[i][j];
            }
        }

        return arr;
    }

    // Function to print Odd Order Magic Square
    public static void SquarePrint2(int[][] arr, int n) {
        int i, j;
        for(i = 0; i < n; i++) { 
            for(j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }  
            System.out.println(); 
        }
    }
}