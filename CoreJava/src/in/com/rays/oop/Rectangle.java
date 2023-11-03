package in.com.rays.oop;

public class Rectangle {
	private int length = 0;
	private int width = 0;
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
		
	}

	public double area() {
		return  length*width;
	}

}
