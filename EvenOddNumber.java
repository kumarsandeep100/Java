import java.util.Scanner;

public class EvenOddNumber {

    // Method to check even or odd
    void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = scan.nextInt();

        EvenOddNumber n = new EvenOddNumber();
        n.evenOdd(num);

        scan.close(); 
    }
}


