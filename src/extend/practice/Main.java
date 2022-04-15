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
			int hnkougek = Rand.get(braveteam.size());
			// 勇者チームの乱数取得
			Human hnrandom = braveteam.get(hnkougek);

			// モンスターチームの乱数インスタンス
			int mskougeki = Rand.get(monsterteam.size());
			// モンスターチームの乱数取得
			Monster msrandom = monsterteam.get(mskougeki);
			
			// 勇者チームのターン
			System.out.println("人間のターン！");
			// 勇者チームが攻撃する。
			hnrandom.attack(msrandom);
			// 敵のhpが０になったらリストの外に出す。
			if (msrandom.hp <= 0) {
				monsterteam.remove(msrandom);
				System.out.println(msrandom.name + "は倒れた。");
				// リストが空になったら勝ち
				if (monsterteam.isEmpty() == true) {
					System.out.println("勇者達は勝利した！");
					break;
				}
			}
			// 人間のターン終了
			// モンスターチームのターン
			System.out.println("モンスターのターン！");
			// モンスターが攻撃する。
			msrandom.attack(hnrandom);
			// 敵のhpが０になったらリストの外に出す。
			if (hnrandom.hp <= 0) {
				braveteam.remove(hnrandom);
				System.out.println(hnrandom.name + "は倒れた。");
				// リストが空になったら勝ち
				if (braveteam.isEmpty() == true) {
					System.out.println("モンスター達は勝利した！");
					break;
				}
			}
		}
	}
}