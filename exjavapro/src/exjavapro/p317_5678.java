package exjavapro;

class Point {
//	public Point() {}
	private int x, y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	public int getX() { return x; }		//변수 x,y가 private이므로 getX,getY를 활용해 외부에서 호출
	public int getY() { return y; }
	protected void move(int x, int y) {this.x = x; this.y = y;}
}


class ColorPoint extends Point{
//	public ColorPoint() {}		
//기본 생성자는 부모(Point)의 기본 생성자가 존재해야 가능. public ColorPoint() {}에서 {super(x,y)}가 생략된것 
//여기서는 Point의 기본 생성자는 없고 생성자 중 Point(int x, int y)를 받아야 하기 때문에 생성 불가능
	public ColorPoint() {super(0, 0);}				//매개변수 없는 생성자 (= 기본 생성자?) 메소드
	public ColorPoint(int x, int y) {				//매개변수 x, y 생성자 메소드
		super(x, y);
	}
	String color="BLACK";
	public ColorPoint(int x, int y, String color) {	//매개변수 x, y, color 생성자 메소드
		super(x, y);
		this.color=color;
	}
	public void setXY(int x, int y) {super.move(x, y);} 
// 생성자 메소드는 생성자 메소드 끼리 호출이 가능하고 일반 메소드는 일반 메소드만 호출 가능
// 따라서 Point 메소드는 호출하지 못하고, move 메소드만 호출 가능하다
	public void setColor(String color) {this.color = color;}
	public String toString() {	
//public인 이유는 부모의 조상격인 object 클래스의 toString 메소드를 상속했는데 그 메소드가 public이기 때문
		return color + "색의 (" + super.getX() + "," + super.getY() + ")의 점";
		//x, y가 private이므로 getX(), getY() 메소드를 사용하여 출력
	}
}


class Point3D extends Point {
	private int z;
	public Point3D(int x, int y, int z) {			//매개변수 x, y, z 생성자 메소드
		super(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {						//toString 메소드 오버라이딩
		return "(" + super.getX() + "," + super.getY() + "," + this.z +")의 점";
	}
	
	protected void move(int x, int y, int z) {		//move 메소드 오버로딩
		super.move(x, y);
		this.z = z;
	}
	protected void moveUp() {this.z = z+1;}
	protected void moveDown() {this.z = z-1;}
	
}


class PositivePoint extends Point {
	public PositivePoint() {super(0, 0);}			//매개변수 없는 생성자 메소드
	
	public PositivePoint(int x, int y) {			//매개변수 x, y 생성자 메소드
		super(0, 0);								//부모 클래스 호출은 첫줄에만 가능
		if (x>0 && y>0)	super.move(x, y);
	}
	
	@Override
	protected void move(int x, int y) {				//move 메소드 오버라이딩
		if (x>0 && y>0)	super.move(x, y);
	}
	
	@Override
	public String toString() {						//toString 메소드 오버라이딩
		return "(" + super.getX() + "," + super.getY() + ")의 점";
	}
}


public class p317_5678 {
	public static void main(String[] args) {
//		5
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
		
		
//		6
		ColorPoint zeroPoint = new ColorPoint(); // (0, 0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp2 = new ColorPoint(10, 10); // (10, 10) 위치의 BLACK 색 점
		cp2.setXY(5, 5);
		cp2.setColor("RED");
		System.out.println(cp2.toString() + "입니다.");
		
		
//		7
		Point3D p = new Point3D(1,2,3); // 1, 2, 3은 각각 x, y, z축의 값.
		System.out.println(p.toString() +"입니다.");
		
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300); // x, y, z 축으로 이동
		System.out.println(p.toString() + "입니다.");
	
		
//		8
		PositivePoint p1 = new PositivePoint();
		p1.move(10, 10);
		System.out.println(p1.toString() + "입니다.");
		
		p1.move(-5, 5); //객체 p1는 음수 공간으로 이동되지 않음
		System.out.println(p1.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}


