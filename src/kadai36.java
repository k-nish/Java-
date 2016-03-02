
public class kadai36 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
System.out.println("【数当てゲーム】");
int ans=new java.util.Random().nextInt(10);
int time;
for(time=0;time<5;time++){
	System.out.println("０〜９からの数字を入力してください。");
	int num = new java.util.Scanner(System.in).nextInt();
    if(num==ans){
    	System.out.println("アタリ！");
    	break;
    }
    if(num!=ans){
    	System.out.println("違います");
    	continue;
    }
}
System.out.println("ゲームを終了します。");
	}

}
