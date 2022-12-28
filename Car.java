class Car
{
  String name;
  int mno;
  String color;
  Car(String nm, int n, String c)
  {
    name=nm;
    mno=n;
    color=c;
  }

  public static void main(String args[])
  {
    Car c1= new Car("Audi", 7892, "Blue");
    Car c2= new Car("XUV",9350,"Black");
    System.out.println("the first car is "+c1.name+" no is "+c1.mno+" and the color is "+c1.color);
    System.out.println("the first car is "+c2.name+" no is "+c2.mno+" and the color is "+c2.color);
  }
}