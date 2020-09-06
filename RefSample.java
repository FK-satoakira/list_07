package list07;

public class RefSample {
	public int times;
	public int nothing;
	public RefSample(int t) {
		this.times = t;
	}
	public RefSample() {
		this.times = 3;
	}
	public void hello(String msg) {
		this.hello(msg, this.times);
	}
	public void hello(String msg, int t) {
		System.out.println("Hello, " + msg + " x" + t);
	}
}
