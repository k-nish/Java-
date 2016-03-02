package kadai13;

public class Kadai13 {

	public static void main(String[] args) {
		Y[] y = new Y[2];
		y[0] = new A();
		y[1] = new B();

		for (Y l : y) {
			l.b();
		}
	}
}