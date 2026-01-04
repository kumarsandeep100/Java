public class Student {

  private int id;
  private String name;

  public void setId(int id){
    this.id = id;
  }

  public int getId(){
    return id;
  }

  public void setName(String name){
    this.name  = name;

  }

  public String getName(){
    return name;
  }

  public static void main(String[] args) {

    Student s1 = new Student();
    s1.setId(1);
    s1.setName("John");

    System.out.println("Id: "+s1.getId());
    System.out.println("Name: "+s1.getName());
    
  }
  



  
  
}
