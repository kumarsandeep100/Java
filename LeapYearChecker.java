import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scan.nextInt();

        if(year%4 != 0){
            System.out.println(year+" is not a leap year");
        }
        else{
            if(year%100 != 0){
                System.out.println(year+" is a leap year");
            }
            else if(year%400!=0){
                System.out.println(year+" is not a leap year");
            }
            else{
                System.out.println(year+" is a leap year");
            }
        }
        scan.close();
    }
    
}
