package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
// リストにインスタンスを格納
		List<Human> Braveteam = new ArrayList<Human>();
		List<Monster> Monsterteam = new ArrayList<Monster>();

		// ドラゴンインスタンス
		Dragon dr = new Dragon();
		Monsterteam.add(dr);

		// オークインスタンス
		Oak oak = new Oak();
		Monsterteam.add(oak);

		// スライムインスタンス
		Slime se = new Slime();
		Monsterteam.add(se);

		// 勇者クラス
		Brave be = new Brave();
		Braveteam.add(be);

		// 戦士インスタンス
		Fighter fr = new Fighter();
		Braveteam.add(fr);

		// 魔法使いインスタンス
		Wizard wd = new Wizard();
		Braveteam.add(wd);
		
		
//各チームを生成
		for (Human Beaver : Braveteam) {
		}
		for (Monster Monsters : Monsterteam) {
		}
		
// 戦闘開始
		while (true) {
			// 勇者チームの乱数インスタンス
			int hnkougek = Rand.get(Braveteam.size());
			// 勇者チームの乱数取得
			Human hnrandom = Braveteam.get(hnkougek);

			// モンスターチームの乱数インスタンス
			int mskougeki = Rand.get(Monsterteam.size());
			// モンスターチームの乱数取得
			Monster msrandom = Monsterteam.get(mskougeki);
			
			// 勇者チームのターン
			System.out.println("人間のターン");
			// 勇者チームが攻撃する。
			hnrandom.attack(msrandom);
			// 敵のhpが０になったらリストの外に出す。
			if (msrandom.hp <= 0) {
				Monsterteam.remove(msrandom);
				System.out.println(msrandom.name + "は倒れた");
				// リストが空になったら勝ち
				if (Monsterteam.isEmpty() == true) {
					System.out.println("勇者たちは勝利した！");
					break;
				}
			}
			// 人間のターン終了
			// モンスターチームのターン
			System.out.println("モンスターのターン");

			// モンスターが攻撃する。
			msrandom.attack(hnrandom);
			// 敵のhpが０になったらリストの外に出す。
			if (hnrandom.hp <= 0) {
				Braveteam.remove(hnrandom);
				System.out.println(hnrandom.name + "は倒れた");
				// リストが空になったら勝ち
				if (Braveteam.isEmpty() == true) {
					System.out.println("モンスターたちは勝利した！");
					break;

				}
			}
		}
	}
}