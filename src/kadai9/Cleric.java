package kadai9;

public class Cleric {

	String name; // 名前の宣言
	int HP = 50; // HPの宣言
	static final int MaxHP = 50; // 最大HPの宣言
	int MP = 10; // MPの宣言
	static final int MaxMP = 10; // 最大MPの宣言

	Cleric(String name, int HP, int MP) {
		this.name = name;
		this.HP = HP;
		this.MP = MP;
	}

	Cleric(String name, int HP) {

		this(name, HP, Cleric.MaxMP);
	}

	Cleric(String name) {

		this(name, Cleric.MaxHP);
	}

	void selfAid() {
		// MPを５消費する代わりにHPを最大HPに回復するメソッド
		MP -= 5;
		this.HP = Cleric.MaxHP;
		System.out.println("MPを５消費した代わりにHPが最大になった！");
	}

	int pray(int praysec) {
		// 祈った秒数とランダムの数の補正分MPを回復
		int addMP = praysec + new java.util.Random().nextInt(2);
		// 理論上のMP増加量
		int ADDMP = Math.min(Cleric.MaxMP - this.MP, addMP);
		// このフィールド上のMPの増加量
		this.MP += ADDMP;
		return ADDMP;
	}
}
