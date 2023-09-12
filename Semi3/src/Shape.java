public abstract class Shape {

 abstract double getArea();
 abstract double getPerimeter();

}

class Shape2  extends Shape{
 private double a;
 private double b;

 public Shape2(int a, int b) {
  this.a = a;
  this.b = b;
 }

 @Override
 double getArea() {
  return a*b;
 }

 @Override
 double getPerimeter() {
  return 2*a + 2*b;
 }
}

class Circul  extends Shape{
 private double r;
 public Circul(double r) {
  this.r = r;
 }
 @Override
 double getArea() {
  return Math.PI * (2 * r);
 }
 @Override
double getPerimeter() {
  return Math.PI * 2 * r;
 }
}

class Tri extends Shape{
 private double a;
 private double b;
 private double c;
 public Tri( double a, double b, double c) {
  this.a = a;
  this.b = b;
  this.c = c;
 }
 @Override
 double getArea() {
  return (a * b)/ 2;
 }
 @Override
 double getPerimeter() {
  return a + b + c;
 }
}

class Triangle extends Shape {
 private final double catA;
 private final double catB;
 private final double hypotenuse;

 public Triangle(double catA, double catB) {
  this.catA = catA;
  this.catB = catB;
  this.hypotenuse = Math.sqrt((catA * catA) + (catB * catB));
 }

 @Override
 public double getArea() {
  return (catA * catB) / 2;
 }

 @Override
 public double getPerimeter() {
  return catA + catB + hypotenuse;
 }
}