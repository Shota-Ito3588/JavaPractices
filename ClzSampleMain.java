// クラスを呼び出す場合
//
// クラスの型(クラス名) 変数名 = new クラスのコンストラクタ();

// クラスのメソッドを呼び出す場合は、

// 変数名.変数名 = xxx;
// 変数名.メソッド名();

// new した変数名のことを「インスタンス（変数）」


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

public class ClzSampleMain {

    public static void main(String[] args) {

        int te = 0;

        ClzSample sample1 = new ClzSample();
        int area = sample1.getArea(4, 3);

        System.out.println(area);

        // 三角形の面積
        int area2 = sample1.getTriangleArea(3, 6);

        System.out.println(area2);

        ClzSample sample2 = new ClzSample();
        int triangleArea = sample2.getTriangleArea(4, 3);

        System.out.println(triangleArea);

        Human ito = new Human();
        ito.name = "伊藤";

        System.out.println(ito.greet());

        Human same = new Human();
        same.name = "鮫島";
        System.out.println(same.greet());


    }
}
