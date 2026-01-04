import java.util.Scanner;

public class ReverseString {

  String revString(String s){
    int l = s.length();
    String rev = "";
    for(int i = 0;i<l;i++){

      rev = s.charAt(i)+rev;

    }
    return rev;
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = scan.nextLine();
    ReverseString r = new ReverseString();
    System.out.println("Reverse string is "+r.revString(s));
    scan.close();
  }
  
}


