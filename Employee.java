public class Employee {

  void work(){
    System.out.println("Employee works");
  }
  
}

class Developer extends Employee{
  void work(){
    System.out.println("Developer writes code");
  }

  public static void main(String[] args) {
    Employee e = new Developer();
    e.work();
  }
}
