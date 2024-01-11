package java9;

public class Wizard {
	String name;
	int hp;

	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復して" + h.hp + "になった");
	}
}
