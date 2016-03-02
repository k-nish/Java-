package lesson16;

import java.sql.*;

public class List1 {

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		Class.forName("org.h2.Driver");
		String dburl = "jdbc:h2:~/test";// 接続先DBを指定
		String sql = "INSERT INTO EMPROYEES(name)VALUES('iida')";
		Connection conn = DriverManager.getConnection(dburl);// DBに接続
		conn.createStatement().executeUpdate(sql);// SQLを送信
		conn.close();// DB接続を閉じる
	}
}
