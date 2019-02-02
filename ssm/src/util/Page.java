package util;

public class Page {

	private int start = 0;
	private int count = 5;
	private int last = 0;
	
	public Page() {
		this(0, 5, 0);
	}
	public Page(int start, int count, int last) {
		super();
		this.start = start;
		this.count = count;
		this.last = last;
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
	
	public void calculateLast(int total) {
		if (0 == total % this.count) {
			this.last = total - count;
		} else {
			this.last = total - (total % this.count);
		}
	}
}
