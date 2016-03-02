package lesson14;

import java.util.Calendar;
import java.util.Date;

public class List3 {

	public static void main(String[] args) {

		Date now = new Date();
		// 現在日時を持つDateインスタンス生成
		Calendar c = Calendar.getInstance();
		// Date型の変数cを指定。
		c.setTime(now);
		// Cに現在日時をDate型で入力
		int y = c.get(Calendar.YEAR);
		// 変数yに今の年を代入し表示　
		System.out.println("今年は" + y + "年です。");

		// 指定した人のDATE型の値を得る。
		c.set(2010, 8, 22, 1, 23, 45);
		c.set(Calendar.YEAR, 2011);
		Date past = c.getTime();
		System.out.println(past);
	}

}
