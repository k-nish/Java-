public class kadai51 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		introduceOneself();
	}

	public static void introduceOneself() {
		System.out.println("名前を書いてください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("年齢を書いてください");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("身長を書いてください");
		int height = new java.util.Scanner(System.in).nextInt();
		System.out.println("あなたの性別を男か女で答えてください。");
		String seibetsu = new java.util.Scanner(System.in).nextLine();
		System.out.println("【自己紹介】");
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("身長：" + height);
		System.out.println("性別：" + seibetsu);
	}
}
