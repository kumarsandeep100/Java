import java.util.Scanner;

class ReverseUsingStringBuffer {

    String reverse(String s) {
      StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scan.nextLine();

        ReverseUsingStringBuffer r = new ReverseUsingStringBuffer();
        System.out.println("Reversed: " + r.reverse(s));

        scan.close();
    }
}
