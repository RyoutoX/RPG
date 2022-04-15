package extend.practice;

public class Dragon extends Monster {

	public Dragon() {
		this.name = "ドラゴン";
		this.hp = 500;
		this.offensive = 50;

	}

	public void attack(Living target) {
		Rand r = new Rand();
		int a = (int) (Math.random() * 10 + 1);
		int total = this.offensive * a;
		target.hp = target.hp - total;
		System.out.println(this.name + "が炎で攻撃！" + target.name + "に" + total + "のダメージを与えた。");

	}

}
