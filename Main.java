package list07;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		long f = r.freeMemory();
		long t = r.totalMemory();
		long m = r.maxMemory();
		System.out.println("f="+f);
		System.out.println("t="+t);
		System.out.println("m="+m);

		System.out.println(Runtime.getRuntime().freeMemory());
		List<Integer> list = new ArrayList<>();
		list.add(130776336);
		list.add(130776208);
		list.add(130776320);
		list.add(130776272);
		list.add(130776320);
		list.add(130776304);

		list.add(132120576);
		list.add(132120576);
//		list.add();
//		list.add();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("");
		System.out.println("f="+f);
		System.out.println("t="+t);
		System.out.println("m="+m);

	}
}

//OSからのメモリ追加は自動。Runtimeはインスタンス化が必要と書いてあったが、無くてもいけた。

