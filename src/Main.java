import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable and scanner initialization
        int rows;
        Scanner scanner = new Scanner(System.in);

        //user input
        System.out.print("Please enter a number: ");
        rows = scanner.nextInt();

        //loop that prints the triangle
        for ( int i = rows; i>= 1; i--) {
            for ( int j = 1; j <= (2 * i -1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}