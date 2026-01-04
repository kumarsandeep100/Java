import java.util.Scanner;

public class StudentResult {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int total_marks = 0;

    System.out.println("Enter marks 1: ");

    int marks = scan.nextInt();
    if(marks<0 || marks>100){
      System.out.println("Invalid marks entered");
      return;
    }
    else{
      total_marks += marks;

    }
    System.out.println("Enter marks 2: ");
    marks = scan.nextInt();
     if(marks<0 || marks>100){
      System.out.println("Invalid marks entered");
      return;
    }
    else{
      total_marks += marks;

    }
     System.out.println("Enter marks 3: ");
    marks = scan.nextInt();
     if(marks<0 || marks>100){
      System.out.println("Invalid marks entered");
      return;
    
    }
    else{
      total_marks += marks;

    }



    
    System.out.println("Total marks: "+total_marks);
    double percentage = (total_marks/3.0);
    System.out.println("Percentage: "+percentage);

    if(percentage>=90){
      System.out.println("Grade : A");

    }
    else if(percentage>=80){
      System.out.println("Grade: B");
    }
    else if(percentage>=70){
      System.out.println("Grade : C");
    }
    else if(percentage>=60){
      System.out.println("Grade: D");
    }
    else{
      System.out.println("Grade: F");
    }
    

  }
  
}
