package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
// リストにインスタンスを格納
		List<Human> braveteam = new ArrayList<Human>();
		List<Monster> monsterteam = new ArrayList<Monster>();

		// ドラゴンインスタンス
		Dragon dr = new Dragon();
		monsterteam.add(dr);

		// オークインスタンス
		Oak oak = new Oak();
		monsterteam.add(oak);

		// スライムインスタンス
		Slime se = new Slime();
		monsterteam.add(se);

		// 勇者クラス
		Brave be = new Brave();
		braveteam.add(be);

		// 戦士インスタンス
		Fighter fr = new Fighter();
		braveteam.add(fr);

		// 魔法使いインスタンス
		Wizard wd = new Wizard();
		braveteam.add(wd);
		
		
// 戦闘開始
		while (true) {
			// 勇者チームの乱数インスタンス
			int hnkougek1 = Rand.get(braveteam.size());
			// 勇者チームの乱数取得
			Human hnrandom1 = braveteam.get(hnkougek1);

			// モンスターチームの乱数インスタンス
			int mskougeki1 = Rand.get(monsterteam.size());
			// モンスターチームの乱数取得
			Monster msrandom1 = monsterteam.get(mskougeki1);

			
			// 勇者チームのターン
			System.out.println("人間のターン！");
			// 勇者チームが攻撃する。
			hnrandom1.attack(msrandom1);
			// 敵のhpが０になったらリストの外に出す。
			if (msrandom1.hp <= 0) {
				monsterteam.remove(msrandom1);
				System.out.println(msrandom1.name + "は倒れた。");
				// リストが空になったら勝ち
				if (monsterteam.isEmpty() == true) {
					System.out.println("勇者達は勝利した！");
					break;
				}
			}
			// 人間のターン終了
			// モンスターチームのターン
			System.out.println("モンスターのターン！");
			// 勇者チームの乱数インスタンス
			int hnkougek2 = Rand.get(braveteam.size());
			// 勇者チームの乱数取得
			Human hnrandom3 = braveteam.get(hnkougek2);

			// モンスターチームの乱数インスタンス
			int mskougeki2 = Rand.get(monsterteam.size());
			// モンスターチームの乱数取得
			Monster msrandom3 = monsterteam.get(mskougeki2);

			// モンスターが攻撃する。
			msrandom3.attack(hnrandom3);
			// 敵のhpが０になったらリストの外に出す。
			if (hnrandom3.hp <= 0) {
				braveteam.remove(hnrandom3);
				System.out.println(hnrandom3.name + "は倒れた。");
				// リストが空になったら勝ち
				if (braveteam.isEmpty() == true) {
					System.out.println("モンスター達は勝利した！");
					break;
				}
			}
		}
	}
}