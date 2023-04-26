package exjavapro;

class MyPoint {	
//꼭 static 달아줘야 하나?, public 달면 왜 빨간줄?
	int a = 0;
	int b = 0;
	
	public MyPoint(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	
	@Override
	public String toString() {
	
		return "Point(" + a + "," + b + ")";
				
	}
}

public class chap6_1 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}
