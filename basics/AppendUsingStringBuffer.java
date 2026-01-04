import java.util.Scanner;

class AppendUsingStringBuffer {

    String appendText(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.append(" java").toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scan.nextLine();

        AppendUsingStringBuffer a = new AppendUsingStringBuffer();
        System.out.println("Result: " + a.appendText(s));

        scan.close();
    }
}
