import java.util.Scanner;
public class EvenOdd {
  static void checkEvenOdd(int num){
    if(num%2==0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int num = scan.nextInt();
    checkEvenOdd(num);
    scan.close();
  }
}
