public class kadai54 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("三角形の底辺の長さをいれてください");
		double bottom = new java.util.Scanner(System.in).nextDouble();
		System.out.println("三角形の高さを入れてください");
		double height = new java.util.Scanner(System.in).nextDouble();
		calcTriangleArea(bottom, height);
		System.out.println("三角形の面積は" + calcTriangleArea(bottom, height) + "㎠");
		System.out.println("円の半径を入れてください");
		double radius = new java.util.Scanner(System.in).nextDouble();
		calcCircleArea(radius);
		System.out.println("円の面積は" + calcCircleArea(radius) + "㎠");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double ans = bottom * height / 2;
		return ans;
	}

	public static double calcCircleArea(double radius) {
		double ans = radius * radius * 3.14;
		return ans;
	}
}
