package list07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Hero.class;
		// 引数1つのコンストラクタを取得し、インスタンスを生成する
//		おそらく [Hero h = new Hero("name",hp);]と同じと考えていいだろう。
//		なので「getConstructor()」の()の引数は揃えるべき。
		Constructor<?> cons = clazz.getConstructor(String.class,int.class);

//		ここも引数は揃えるべきだろう。「newInstance("akira",256)」
		Hero rs = (Hero) cons.newInstance("akira",256);
		System.out.println(rs);
		// timesフィールドに関するFieldを取得して読み書き

//		HeroフィールドをprivateにするとFieldがつかえなくなるっぽい。
		Field f = rs.getClass().getDeclaredField("hp");
//		f.setInt(rs, 20000);                 // rsのtimesに代入
		System.out.println(f.get(rs)); // rsのtimesを取得
//		// 引数2つのhelloメソッドを取得して呼び出す
//		Method m = clazz.getMethod("hello", String.class, int.class);
//		m.invoke(rs, "reflection!", 128);
//		// クラスやメソッドへの修飾（publicやfinalの有無）を調べる
//		boolean pubc = Modifier.isPublic(clazz.getModifiers());
//		boolean finm = Modifier.isFinal(m.getModifiers());
	}
}


