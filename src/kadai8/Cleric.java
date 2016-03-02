package kadai8;

public class Cleric {

	String 名前; // 名前の宣言
	int HP = 50; // HPの宣言
	final int 最大HP = 50; // 最大HPの宣言
	int MP = 10; // MPの宣言
	final int 最大MP = 10; // 最大MPの宣言

	void selfAid() {
	//MPを５消費する代わりにHPを最大HPに回復するメソッド
		MP -= 5;
		this.HP = this.最大HP;
		System.out.println("MPを５消費した代わりにHPが最大になった！");
	}

	int pray(int praysec) {
		//祈った秒数とランダムの数の補正分MPを回復
		int addMP = praysec + new java.util.Random().nextInt(2);
		//理論上のMP増加量
		int ADDMP=Math.min(最大MP-this.MP,addMP);
		//このフィールド上のMPの増加量
		this.MP+=ADDMP;
		return ADDMP;
	}
}
