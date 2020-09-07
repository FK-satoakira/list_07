package list07;

public class Hero {
	private String name;
	private int hp;
//	public String name;
//	public int hp;
	public Hero() {
		this.name="HERO";this.hp=100;
	}
	public Hero(int hp) {
		this("HERO",hp);
	}
	public Hero(String name) {
		this(name,100);
	}
	public Hero(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	public void evolution() {
		this.name="SuperHERO";
		this.hp=150;
		System.out.println("ヒーローはスーパーヒーローに進化した");
	}
	public void evolution(String name) {
		this.name="UltraHERO"+"["+name+"]";
		this.hp=200;
		System.out.println("ヒーローはウルトラヒーローに進化した");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + "]";
	}

}
