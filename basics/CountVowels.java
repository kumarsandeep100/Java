import java.util.Scanner;

class CountVowels {

    int countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;
        for(int i = 0;i<s.length();i++){
          char ch = s.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
          }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine();

        CountVowels c = new CountVowels();
        System.out.println("Vowels = " + c.countVowels(s));

        scan.close();
    }
}
