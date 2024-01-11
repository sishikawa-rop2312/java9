package java9;

public class Hero {
	String name;	// 名前の宣言
	int hp;			// HPの宣言
	
	Sword sword;
	
	// コンストラクタ
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
	}
	
	
	public void attack() {
		this.hp = 100;
		System.out.printf("%sは%sで攻撃した！\n", this.name, this.sword.name);
		System.out.printf("敵に%dポイントのダメージをあたえた！\n", (5 + this.sword.damage));
	}
}
