abstract class Shape {
abstract double calculateArea();

void displayShape(){
System.out.println("This is a shape");
}
}

class Circle extends Shape {
double radius=5;

double calculateArea(){
return 3.14*radius*radius;
}
}

class Rectangle extends Shape {
double length=4;
double breadth=6;

double calculateArea(){
return length*breadth;
}

public static void main(String[] args){
Shape s1=new Circle();
System.out.println("Circle Area: "+s1.calculateArea());

Shape s2=new Rectangle();
System.out.println("Rectangle Area: "+s2.calculateArea());
}
}