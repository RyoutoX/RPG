package extend.practice;

public class Wizard extends Human {
	
	public Wizard() {
		this.name = "魔法使い";
		this.hp = 300;
		this.offensive = 20;
	}


	public void attack(Living target) {
		Rand r = new Rand();
		int a = Rand.get(9);
		int total = this.offensive * a;
		target.hp = target.hp - total;
		System.out.println(this.name + "が魔法で攻撃！" + target.name + "に" + total + "のダメージを与えた。");
	}
}

