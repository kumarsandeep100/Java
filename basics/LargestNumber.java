import java.util.Scanner;
public class LargestNumber {
  static int largest(int a, int b, int c){
    if(a>=b&&a>=c){
      return a;
    }
    else if(b>=a&&b>=c){
      return b;
    }
    else{
      return c;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = scan.nextInt();
    System.out.print("Enter second number: ");
    int b = scan.nextInt();
    System.out.print("Enter third number: ");
    int c = scan.nextInt();
    System.out.println("Largest number is "+largest(a, b, c));
    scan.close();
  }
}
