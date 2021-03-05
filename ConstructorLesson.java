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

public class ConstructorLesson {

    public static void main (String[] args) {

        Human2 sample4 = new Human2("山田");
        System.out.println(sample4.ansName());

        Human2 sample5 = new Human2("山田", 30);
        System.out.println(sample5.ansName());
        System.out.println(sample5.ansAge());

        Human2 sample6 = new Human2("山田", 30, "男");
        System.out.println(sample6.ansName());
        System.out.println(sample6.ansAge());
        System.out.println(sample6.ansGender());

    }
}
