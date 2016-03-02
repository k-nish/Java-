public class kadai22 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(3);
		fortune++;
		String Fortune;
		if (fortune == 1)
			;
		Fortune = "大吉";
		if (fortune == 2)
			;
		Fortune = "中吉";
		if (fortune == 3)
			;
		Fortune = ("吉");
		if (fortune == 4)
			;
		Fortune = ("凶");
		System.out.println("占いの結果が出ました！");
		System.out
				.println(age + "歳の" + name + "さん、あなたの今日の運勢は" + Fortune + "です！");

	}
}
