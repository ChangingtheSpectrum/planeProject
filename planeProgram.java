import java.util.Scanner;

/*
  Simple program for tracking airplane seats
 */

public class Seats {
 
    public static void main(String[] args) {
        // Create an array of characters for the seats
        char[][] firstClass = new char[5][4];
 
        // Populate it
        for (int i = 0; i < 5; i++) {
            seats[i][0] = 'A';
            seats[i][1] = 'B';
            seats[i][2] = 'C';
            seats[i][3] = 'D';
        }

        char[][] economy = new char[30][6]

        
 
        Scanner in = new Scanner(System.in);
 
        // Make a counter for the number of seats filled
        int filled = 0;
 
        printSeats(seats);
 
        // Prompt for seat input, then loop until all seats are filled
        System.out.println(
            "Enter seat to assign (e.g., '1A'), or a blank line to quit:");
        String input = in.nextLine();
        while ((filled < 28) && (input != null) && (input.length() > 0)) {
 
 
    
 
 
            System.out.println();
            if (filled < 28) {
                System.out.println("Enter seat to assign (e.g., '1A'), " +
                    "or a blank line to quit:");
                in.nextLine();
                input = in.nextLine();
            }
        }
 
        System.out.println("Final seat assignments: ");
        printSeats(seats);
 
    }
 
    /*
      Utility method that prints the contents of the seats array
     */
    private static void printSeats(char[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            System.out.println((i + 1) + "   " +
                seats[i][0] + " " + seats[i][1] + "  " +
                seats[i][2] + " " + seats[i][3]);
        }
    }
}
