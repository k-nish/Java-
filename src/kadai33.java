public class kadai33 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちは");
		System.out.println("あなたの性別を男か女で答えてください。");
		String seibetsu = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を答えてください。");
		int age = new java.util.Scanner(System.in).nextInt();
		if (seibetsu.equals("男")) {
			System.out.println("私は男です。");
			System.out.println("私の年齢は" + age + "歳です。");
		}
		if (seibetsu.equals("女")) {
			System.out.println("私は女です。");
		}
		System.out.println("よろしくお願いします。");
	}

}
