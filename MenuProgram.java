import java.util.Scanner;

public class MenuProgram {

  static void checkEvenOdd(int num){
    if(num % 2 == 0) System.out.println("Even");
    else System.out.println("Odd");
  }

  static int sumOfDigits(int num){
    int temp = num, sum = 0;
    while(temp != 0){
      sum += temp % 10;
      temp /= 10;
    }
    return sum;
  }

  static int reverseNumber(int num){
    int temp = num, rev = 0;
    while(temp != 0){
      int rem = temp % 10;
      rev = rev * 10 + rem;
      temp /= 10;
    }
    return rev;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while(true){
      System.out.println("\n1 Even/Odd");
      System.out.println("2 Sum of Digits");
      System.out.println("3 Reverse Number");
      System.out.println("4 Exit");

      System.out.print("Enter Choice: ");
      int choice = scan.nextInt();

      switch(choice){
        case 1:
          System.out.print("Enter number: ");
          checkEvenOdd(scan.nextInt());
          break;

        case 2:
          System.out.print("Enter number: ");
          System.out.println(sumOfDigits(scan.nextInt()));
          break;

        case 3:
          System.out.print("Enter number: ");
          System.out.println(reverseNumber(scan.nextInt()));
          break;

        case 4:
          System.out.println("Exit");
          scan.close();
          return;

        default:
          System.out.println("Invalid Entry");
      }
    }
  }
}
