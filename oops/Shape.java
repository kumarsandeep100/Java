public class Shape {

  void draw(){
    System.out.println("Drawing shape");
  }
  
}

class Circle extends Shape{
  void draw(){
    System.out.println("Drawing circle");
  }

  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.draw();
  }
}
