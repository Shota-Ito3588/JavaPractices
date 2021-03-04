public class ConstructorSample {


    public String name;

    public int age;

    // コンストラクタ
    // 特別なメソッド
    // アクセス修飾子 クラス名(引数...)

    // デフォルトのコンストラクタ
    //  - 引数なし
    //  - 暗黙的に作られる(コンストラクタがない場合のみ)
    //  -

    // コンストラクタ
//    public ConstructorSample() {
//
//    }

    // コンストラクタ上で初期値を設定したい場合
    public ConstructorSample(String name, int age) {
        // this => このクラス
        this.name = name;
        this.age = age;
    }

    public ConstructorSample(String name) {
        this.name = name;
    }

    public String greet() {
        String g = name + "さんこんにちは";
        return g;
    }

    public String ansAge() {
        String a = "私は" + age + "さいです";
        return a;
    }


}
