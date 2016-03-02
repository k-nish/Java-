package lesson16;

import java.io.InputStream;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;

public class Kadai1 {

	public static void main(String[] args) throws MalformedURLException,
			IOException {
		// TODO 自動生成されたメソッド・スタブ
		URL u = new URL("http://www.impressjapan.jp/");
		InputStream is = u.openStream();
		int i = is.read();
		while (i != -1) {
			char c = (char) i;
			System.out.println(c);
			i = is.read();
		}
	}

}
