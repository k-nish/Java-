package kadai10;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10; // 基本回復ポイント
		int recovPoint = (int) (basePoint * this.getWand().getPower());
		// 杖による増幅
		double recovPercent =recovPoint/h.getHp(); //杖による魔法による増幅率
		if(recovPercent<0.5||recovPercent>100.0){
			throw new IllegalArgumentException("増幅率が0.5未満もしくは100.0超過である。処理を中断。");
		}
		else
		h.setHp(h.getHp() + recovPoint); // 勇者のHPを回復させる
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if(hp<0){
			this.hp=0;
		}
		this.hp = hp;
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		if(mp<0){
			throw new IllegalArgumentException("MPが負の数である。処理を中断。");
		}
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Wand getWand(){
		return this.wand;
	}
	public void setWand(Wand wand){
		if(wand==null){
			throw new IllegalArgumentException("杖がnullである。処理を中断。");
		}
		this.wand=wand;
		
	}
}
