package lib;

public class Rectangle {
	//Fields
	private int x, y;
	private int w, h;
	
	//Constructors
	public Rectangle() {
		this.x = 0; 
		this.y = 0;
		this.w = 1;
		this.h = 1;
	}
	
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	//Methods
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getW() {
		return w;
	}
	
	public int getH() {
		return h;
	}
	
	public int getArea() {
		return w * h;
	}
	
	public int getPerimeter() {
		return 2 * w + 2* h;
	}
	
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public void expand(double scaleW, double scaleH) {
		w *= scaleW;
		h *= scaleH;
	}
	
	public String toString() {
		return "[TopLeftCorner = (" + x + "," + y + "), Dimensions =" +
				 "(" + w + "," + h + ") ]";
	}
	
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Rectangle object = (Rectangle) obj;
		
		return this.x == object.x && this.y == object.y && this.w == object.w && this.h == object.h;
		
	}
}
