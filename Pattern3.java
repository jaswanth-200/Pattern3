import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        // input from user
        int n = sc.nextInt();
        
        int columns;
        int spaces;
        
        // Loop for printing each row of the pattern
        for(int i = 1; i <= n; i++) {
            // Calculate the number of spaces 
            spaces = n - i;
            for(int s = 0; s < spaces; s++) {
                // Print spaces
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j); 
            }
            // Print the increasing sequence
            for(int j = 2; j <= i; j++) {
                System.out.print(j); 
            }
            //next line
            System.out.println();
        }
    }
}
