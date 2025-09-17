class Shape{
double radius;
double length;
double width;

final double PI = 3.14159;

public void area(double radius){
this.radius = radius;
System.out.println("Area Of Circle With Radius "+radius+": "+ PI * (this.radius * this.radius));
}

public void area(double length,double width){
this.length = length;
this.width = width;
System.out.println("Area Of Rectangle With length "+this.length+" and width "+this.width +": "+ (this.length * this.width));
}
}
public class ShapeCalculator{
public static void main(String[] args){
Shape S1;// = new Shape();
Shape S2; //= new Shape();
S1.area(6.0);
S2.area(12,8);
}
}
