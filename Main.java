package list07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Hero.class;
//		引数1つのコンストラクタを取得し、インスタンスを生成する。
//		今のところgetConstructor()とnewInstance()は2つで１つと考えたほうがいい。
//		ので、引数を揃える。
		Constructor<?> cons = clazz.getConstructor(int.class);
		Hero hero = (Hero) cons.newInstance(55);
		System.out.println("name=\"HERO\",hp=55としてインスタンスを作る。");
		System.out.println(hero);
		// Fieldを取得して読み書き
//		public→getField("フィールド名");
//		private→getDeclaredField("フィールド名");
		Field f1 = clazz.getDeclaredField("name");
		Field f2 = clazz.getDeclaredField("hp");

		f1.setAccessible(true); /*setAccessible()でtrueとともに呼び出さないとprivateにはアクセス不可と思われる*/
		f2.setAccessible(true);
		System.out.print(f1.get(hero)+" ");	System.out.print(f2.get(hero));
		System.out.println("");
		f1.set(hero, "taro");
		f2.set(hero, 40); 	/*フィールドに新たに値を代入。	フィールド.set(クラスのインスタンス,値)*/
		System.out.println("-----");
		System.out.println("\"taro\",40に変更");
		System.out.print(f1.get(hero)+" ");	System.out.print(f2.get(hero));
		System.out.println("");
		System.out.println("-----");


		Method m = clazz.getMethod("evolution"); /*引数無しのevolutionメソッドをmに代入してる*/
		Method m2 = clazz.getMethod("evolution",String.class);/*引数がString一個のevolutionメソッドをm2に代入してる*/
		System.out.println("メソッドでスーパーヒーローに進化");
		m.invoke(hero); /*invoke()でそのメソッドを使う。引数にインスタンスの変数の入れる*/

		System.out.print(f1.get(hero)+" ");	System.out.print(f2.get(hero));
		System.out.println("");System.out.println("-----");
		System.out.println("メソッドでウルトラヒーローに進化");

		m2.invoke(hero, "sukkiri"); /*そのメソッドに引数がある場合は""で囲み渡す*/
		System.out.print(f1.get(hero)+" ");	System.out.print(f2.get(hero));
		// クラスやメソッドへの修飾（publicやfinalの有無）を調べる
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
//		boolean finm = Modifier.isFinal(m.getModifiers());
	}
}
