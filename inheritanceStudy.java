package Inheritance;
class Shape {//Parent class or Base class
	double pi = 3.14;
	double getSquare(int r)
	{
		return r*r;
	}
}
class Circle extends Shape{
	void area(int r)
	{
		System.out.println(pi*getSquare(r));
	}
}

public class InheritanceStudy {
	public static void main(String [] args) {
		Circle c = new Circle();
		c.area(5);
	}

}
