package lesson14;

public class List1 {

	public static void main(String[] args) {
		// long値を用いた日付表示
		long start = System.currentTimeMillis();
		// ここで何らかの時間がかかる処理
		long end = System.currentTimeMillis();
		System.out.println("処理にかかって時間は" + (end - start) + "msでした。");
	}

}
