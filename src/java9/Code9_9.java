package java9;

public class Code9_9 {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		System.out.println(h.name);
		System.out.println(h.hp);
		
		Hero h2 = new Hero();
		System.out.println(h2.name);
		System.out.println(h2.hp);
	}
}
