public class Rectangle {
	private int a;
	private int b;
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getSquare() {
		return this.a*this.b;		
	}
	public int getPerimetr() {
		return (this.a+this.b)*2;
	}
	public int getSideA() {
		return a;
	}
	public int getSideB() {
		return b;
	}
}