package day_06.powtorka;

public class Box implements Comparable<Box>{
	
	private int width;
	private int height;
	private int lenght;
	
	public Box(int widht, int height, int lenght) {
		this.width = widht;
		this.height = height;
		this.lenght = lenght;
	}

	public void setWith(int width) {
		if (width > 0)
			this.width = width;
	}
	public void setHeight(int height) {
		if (height > 0)
			this.height = height;
	}
	public void setLenght(int lenght) {
		if (lenght > 0)
			this.lenght = lenght;
	}
	
	public int getDepth() {
		return width*height*lenght;
	}
	public int getWith() {
		return width;
	}
	public int getLenght() {
		return lenght;
	}
	public int getHeight() {
		return height;
	}

	@Override
	public int compareTo(Box o) {
		if (this.getDepth() > o.getDepth()) 
			return 1;
		if (this.getDepth() == o.hashCode())
			return 0;
		return -1;
	}
	
}
