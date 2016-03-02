public class kadai53 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("メールのタイトルは？");
		String title = new java.util.Scanner(System.in).nextLine();
		System.out.println("宛先は？");
		String address = new java.util.Scanner(System.in).nextLine();
		System.out.println("本文を書いてください");
		String text = new java.util.Scanner(System.in).nextLine();
		email(address, title, text);
		System.out.println("");
		email(address, text);
	}

	public static void email(String address, String title, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました。");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");

	}

	public static void email(String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：「" + text + "」");
	}
}
