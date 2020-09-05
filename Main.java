package list07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		System.out.println("ご利用のjavaのバージョン");
		System.out.println(System.getProperty("java.version"));
		Properties p = System.getProperties();
		List<String> list = new ArrayList<>();

		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("【システムプロパティ一覧】");
		int n = 1;
		while(i.hasNext()) {
//			list.add(i.next());
			System.out.print(n);
			String key = i.next();
			list.add(key);
//			System.out.println(key);
			System.out.print(key+"=");
			System.out.println(p.get(key));
			System.out.println((list.indexOf(key)+1)+key);

//			System.out.print(key+"=");
//			System.out.println(System.getProperty(key));
//			System.out.print(key+"=");
//			System.out.println(p.get(key));
			n++;
		}
	}
}

// System.getProperty(key) と p.get(key)は同じく扱えた。
//stringPropertyNames()をコレクションに入れることも可
