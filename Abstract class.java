
package java_lab;
abstract class Shape{
abstract void numberOfSides( );
}
class Rectangle extends Shape{
void numberOfSides( ){
		System.out.println("I am Recatangle, I have 4 sides.");
	}
}
class Triangle extends Shape{
	void numberOfSides( ){
		System.out.println("I am Triangle, I have 3 sides.");
	}	
}
class Hexagon extends Shape{
	void numberOfSides( ){
		System.out.println("I am Hexagon, I have 6 sides.");
	}	
}
public class AbstractShape{
	public static void  main(String[] args) {
	    Rectangle Rect = new Rectangle();
	    Rect.numberOfSides();
		Triangle Tri = new Triangle();
	    Tri.numberOfSides();
	    Hexagon Hex = new Hexagon();
	    Hex.numberOfSides();
	}
}
