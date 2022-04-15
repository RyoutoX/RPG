package extend.practice;

public class Slime extends Monster {

	public Slime() {
		this.name = "スライム";
		this.hp = 300;
		this.offensive = 20;

	}

	public void attack(Living target) {
		Rand r = new Rand();
		int a = (int) (Math.random() * 10 + 1);
		int total = this.offensive * a;
		target.hp = target.hp - total;
		System.out.println(this.name + "が体当たりで攻撃！" + target.name + "に" + total + "のダメージ");
	}
}
