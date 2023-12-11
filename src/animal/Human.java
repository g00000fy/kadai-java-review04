package animal;

public class Human extends Animal implements Thinkable {

	//フィールド
	private String hobby;

	//getter
	public String gethobby() {
		return hobby;
	}

	// setter
	public void sethobby(String hobby) {
		this.hobby = hobby;
	}

	// 引数なしコンストラクタ
	public Human() {
	}

	// 引数ありコンストラクタ
	public Human(String name, int age, String hobby) {
		super(name, age);
		this.hobby = hobby;
	}
	@Override
	// メソッド
	// 趣味紹介
	public void think() {
		System.out.println("私は" + hobby + "について考えています。");
	}

}
