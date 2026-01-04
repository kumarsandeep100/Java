public class Car {
  String brand;
  int speed;

  Car(String brand, int speed){
    this.brand = brand;
    this.speed = speed;
  }
  
}

class Main{
  public static void main(String[] args) {
    Car car = new Car("Honda", 33);

    System.out.println("Brand: "+car.brand);
    System.out.println("Speed: "+car.speed);
 

   
  }
}
