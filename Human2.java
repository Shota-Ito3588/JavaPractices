// 問題 コンストラクタを作成してそれぞれのインスタンスを作成する

// クラス名: Human2
//  クラス変数:
//   - 名前
//   - 年齢
//   - 性別
//  メソッド
//   - 名前を返すメソッド
//   - 年齢を返すメソッド
//   - 性別を返すメソッド
//  コンストラクタ
//   - 引数1つ 名前
//   - 引数2つ 名前, 年齢
//   - 引数3つ 名前, 年齢, 性別

public class Human2 {

    public String name;

    public int age;

    public String gender;

    public Human2(String name) {
        this.name = name;
    }

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human2(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String ansName() {
        String n = "名前は" + name + "です。";
        return n;
    }

    public String ansAge() {
        String a = "年齢は" + age + "歳です。";
        return a;
    }

    public String ansGender() {
        String g = "性別は" + gender + "です。";
        return g;
    }
}
