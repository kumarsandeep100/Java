import java.util.Scanner;
public class FibonacciSeries {


  void fiboSeries(int term){
    if(term<=0){
      System.out.println("Enter number more than zero");
      return;
    }
    int a = 0, b = 1,c;
    for(int i = 1;i<=term;i++){
      System.out.print(a+" ");
      c = a+b;
      a=b;
      b=c;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter term for the series: ");
    int term = scan.nextInt();
    FibonacciSeries f = new FibonacciSeries();
    f.fiboSeries(term);
    scan.close();
  }


  
}


