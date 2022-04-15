package extend.practice;

public class Fighter extends Human {
	
	public Fighter() {
		this.name = "戦士";
		this.hp = 400;
		this.offensive = 30;
	}

	public void attack(Living target) {
		Rand r = new Rand();
		int a = (int) (Math.random() * 10 + 1);
		int total = this.offensive * a;
		target.hp = target.hp - total;
		System.out.println(this.name + "が斧で攻撃！" + target.name + "に" + total + "のダメージ");
	}
}

