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
    Student s1 = new Student();
    s1.study();
    
    
  }
}
