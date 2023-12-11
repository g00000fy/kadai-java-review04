package animal;

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
