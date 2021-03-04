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

public class CarMain {
    public static void main(String[] args) {

// クラスの型(クラス名) 変数名 = new クラスのコンストラクタ();
// クラスのメソッドを呼び出す場合は、
// 変数名.変数名 = xxx;
// 変数名.メソッド名();

        Car prius = new Car();
        prius.name = "プリウス";
        System.out.println(prius.ansName());

        Car white = new Car();
        white.color = "ホワイト";
        System.out.println(white.ansColor());

        Car toyota = new Car();
        toyota.maker = "トヨタ";
        System.out.println(toyota.ansMaker());

        Car engine = new Car();
        engine.engineSize = "1800cc";
        System.out.println(engine.ansEngine());

        Car priusWhite = new Car();
        priusWhite.name = "プリウス";
        priusWhite.color = "ホワイト";
        System.out.println(priusWhite.nameColor());

    }
}
