import java.util.Scanner;

public class GCDCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int largeNum = Math.max(num1,num2);
        int GCD = 0;

        
        for(int i = 1; i<=largeNum;i++){

            if(num1%i==0 && num2%i==0){
                GCD = i;
            }

        }
        System.out.println(GCD);
        scan.close();
    }
    
}
