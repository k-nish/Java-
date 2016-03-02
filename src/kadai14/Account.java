package kadai14;

public class Account {
	String accountNumber; // 口座番号の宣言
	int balance; // 残高の宣言

	public String toString() {
		return "¥" + balance + "(口座番号＝" + accountNumber + ")";
	}
	public boolean equals(Object o){
		if(this==o){
			return true;
		}
		if(o instanceof Account){
			Account a=(Account)o;
			String A1=this.accountNumber.trim();
			String A2=a.accountNumber.trim();
			if(A1.equals(A2)){
				return true;
			}
		}
		return false;
	}
}
