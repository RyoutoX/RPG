package extend.practice;

public class Oak extends Monster {

	public Oak() {
		this.name = "オーク";
		this.hp = 400;
		this.offensive = 30;

	}

	public void attack(Living target) {
		Rand r = new Rand();
		int a = (int) (Math.random() * 10 + 1);
		int total = this.offensive * a;
		target.hp = target.hp - total;
		System.out.println(this.name + "が槍で攻撃！" + target.name + "に" + total + "のダメージを与えた。");
	}
}