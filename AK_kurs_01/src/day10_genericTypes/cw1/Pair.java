package day10_genericTypes.cw1;

public class Pair <S, T> {
	S first;
	T last;
	
	public Pair(S s, T t) {
		first = s;
		last = t;
	}
	
	public S getFirst() {
		return first;
	}
	public void setFirst(S first){
		this.first = first;
	}
	
	public T getLast(){
		return last;
	}
	public void setLast(T last){
		this.last = last;
	}
}
