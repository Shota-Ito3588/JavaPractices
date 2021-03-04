public class ConstructorSampleMain {

    public static void main (String[] args) {

        // デフォルトコンストラクタ
        //ConstructorSample sample1 = new ConstructorSample();

        // 引数ありのコンストラクタ
        ConstructorSample sample2 = new ConstructorSample("山田", 30);
        System.out.println(sample2.greet());
        System.out.println(sample2.ansAge());

        ConstructorSample sample3 = new ConstructorSample("砂糖");

//        Human h = new Human();
//        h.name = "やまだ";
////        Human a = new Human("");
//        System.out.println(h.greet());

    }
}
