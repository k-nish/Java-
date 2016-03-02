package lesson14;

import java.util.Date;

public class List2 {

	public static void main(String[] args) {
		// Date型のインスタンスを用いた日付表示
		Date now = new Date();//現在日時を持つインスタンス生成
		System.out.println(now);//Date型で表示
		System.out.println(now.getTime());//現在日時をlong値で取得し、表示
		Date past = new Date(1316622225935L);//過去のある日時をlong値で指定し、Date型で表示
		System.out.println(past);

	}

}
