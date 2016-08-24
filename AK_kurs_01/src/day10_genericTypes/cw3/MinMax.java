package day10_genericTypes.cw3;

public class MinMax<T> {
	private T min;
	private T max;
	
	public MinMax(T min, T max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	public T getMin() {
		return min;
	}
	public void setMin(T min) {
		this.min = min;
	}
	public T getMax() {
		return max;
	}
	public void setMax(T max) {
		this.max = max;
	}
	

}
