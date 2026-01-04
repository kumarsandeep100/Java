public class Person {

  Person(){
    System.out.println("Person created");
  }
  
}

class Student extends Person{
  Student(){
    super();
    System.out.println("Student created");
  }
  void study(){
    System.out.println("Student studies");
  }

  public static void main(String[] args) {
    StudentBasic s1 = new StudentBasic();
    s1.study();
    
    
  }
}
