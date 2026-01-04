import java.util.Scanner;

class PalindromeString{
  
  boolean isPalindrome(String s){
    s = s.toLowerCase().replace(" ","");
    int l = s.length();
    String rev = "";
    for(int i = 0; i< l; i++){
      rev = s.charAt(i) + rev;
    }
    return s.equals(rev);
    
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = scan.nextLine();
    PalindromeString p = new PalindromeString();

    if(p.isPalindrome(s)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
    scan.close();
    
  
  }
}