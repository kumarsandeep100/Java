import java.util.Scanner;
class NumberCheck{
  static void checkNumber(int num){
    if(num==0){
      System.out.println("zero");
    }
    else if(num<0){
      System.out.println("negative");
    }
    else{
      System.out.println("positive");
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number: ");
    checkNumber(scan.nextInt());
    scan.close();
  }
}