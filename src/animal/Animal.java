package animal;

//名前を格納するフィールドと年齢を格納するフィールドを定義してください（苗字と名前は分けなくてOKです）
//変数名は自由とします
//カプセル化を使ってください
//コンストラクタに名前・年齢の情報を格納する引数を設定し、処理内容として名前・年齢の各フィールドを引数の情報で初期化するようにしてください
//引数の名前は自由とします
//say という名前のpublicなメソッドを定義してください。このメソッドを実行すると、フィールドに代入された名前と年齢を使って ○○です。△△歳です。 と画面に System.out.println() で表示するように処理を作りましょう（戻り値の指定は不要です）

public class Animal {
	//フィールド
	private String name;		//氏名
	private int age;			//年齢

	//コンストラクタ
	public Animal() {
	}

	//引数ありコンストラクタ
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	    public String getname() {
	        return name;
	    }

	    public void setname(String name) {
	    	this.name = name;
	    }

	    public int age() {
	    	return age;
	    }

	    public void setage(int age) {
	    	this.age = age;
	    }

	    // メソッド
	    //自己紹介
	    public void say() {
	    	System.out.println(name + "です。" + age + "歳です。");
	    }

	 }
