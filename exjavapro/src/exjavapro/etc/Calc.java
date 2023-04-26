package exjavapro.etc;

public class Calc {	//다른 패키지에서 사용하려면 public 달아줘야함

	private int x, y;
	public Calc(int x, int y) { this.x = x; this.y = y; }
	public int sum() { return x+y; }	
	
}
