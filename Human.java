// クラス
// - クラスとは「データ」と「処理」をまとめて持っているもの
//   - データ 変数
//   - 処理 メソッド

// - クラスに変数を定義する場合、
// ```
// アクセス修飾子 型 変数名
// ```
public class Human {

    public String gender;

    public int age;

    public String name;

    public String greet() {
        String g = name + "さんこんにちは";
        return g;
    }

    public String ansAge() {
        String a = "私は" + age + "さいです";
        return a;
    }

}
