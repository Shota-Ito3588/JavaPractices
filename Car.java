// 問題

// CarMainクラスを作って、Carクラスのインスタンスを作って、
// メソッドを実行する。

// クラス名: Car
//  クラス変数:
//   - 名前
//   - 色
//   - メーカー
//   - 排気量
//  メソッド
//   - 車名を返すメソッド
//   - 色を返すメソッド
//   - メーカーを返すメソッド
//   - 排気量を返すメソッド
//   - 車名と色を返すメソッド

public class Car
{
    public String name;

    public  String color;

    public String maker;

    public String engineSize;

    public String ansName() {
        String n = "車名は" + name + "です。";
        return n;
    }

    public String ansColor() {
        String c = "カラーは" + color + "です。";
        return c;
    }

    public String ansMaker() {
        String m = "メーカーは" + maker + "です。";
        return m;
    }

    public String ansEngine() {
        String e = "排気量は" + engineSize + "です。";
        return e;
    }

    public String nameColor() {
        String nc = "車名は" + name + "で、" + "カラーは"  + color + "です。";
        return nc;
    }
}
