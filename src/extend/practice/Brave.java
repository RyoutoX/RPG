package extend.practice;

public class Brave extends Human {
	
	public Brave() {
		this.name = "勇者";
		this.hp = 500;
		this.offensive = 50;
	}


	public void attack(Living target) {
		Rand r = new Rand();
		int a = (int) (Math.random() * 10 + 1);
		int total = this.offensive * a;
		target.hp = target.hp - total;
		System.out.println(this.name + "が剣で攻撃！" + target.name + "に" + total + "のダメージを与えた。");
	}
}

