package kadai14;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kadai141 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date now = new Date(); // 現在の日時をDate型で取得

		Calendar c = Calendar.getInstance();
		c.setTime(now); // 取得した日時情報をCalendarにセット
		int d = c.get(Calendar.DAY_OF_MONTH); // Calendarから日の数値を取得
		int D = d + 100; // 取得した値に１００をたす
		c.set(Calendar.DAY_OF_MONTH, D); // DをCalendarの「日」にセット
		Date Dn = c.getTime();// Calendarの日付情報をDate型に変換
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(Dn);
		System.out.println(s);

	}

}
