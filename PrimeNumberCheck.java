import java.util.Scanner;
class PrimeNumberCheck{
    
    //prime number method / logic
    boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        else{
            for(int i = 2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
     }


     //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scan.nextInt();
        PrimeNumberCheck prime = new PrimeNumberCheck();
        if(prime.isPrime(num)){
            System.out.println(num+" is a prime number.");
        }
        else{
            System.out.println(num+" is not a prime number.");
        }
        scan.close();
    }




}