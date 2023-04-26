package exjavapro;

class Shape {
	
	public void draw() { System.out.println("Shape"); }
	
}

class Circle2 extends Shape {
	
	public void draw() { System.out.println("Circle"); }
	
}

public class chap6_4 {
	
	public static void main(String[] args) {
		Shape shape = new Circle2();
		shape.draw();

	}

}
