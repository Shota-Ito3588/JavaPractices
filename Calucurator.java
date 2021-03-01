//クラス名: Calucurator
//        メソッド： 足し算
//        引数: a, b
//        戻り値: int

//        メソッド： 引き算
//        引数: a, b
//        戻り値: int

//        メソッド： かけ算
//        引数: a, b
//        戻り値: int

//        メソッド： わり算
//        引数: a, b
//        戻り値: int

public class Calucurator {

    public static void main(String[] args) {

        int ans = Calucurator.plus(2, 3);
        int ans1 = Calucurator.minus(5, 2);
        int ans2 = Calucurator.mul(5, 2);
        int ans3 = Calucurator.plus(4, 4);
        int ans4 = Calucurator.minus(4, 4);

        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);

    }

    public static int plus(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static int minus(int a, int b) {
        int ans = a - b;
        return ans;
    }

    public static int mul(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static int divi(int a, int b) {
        int divi = a / b;
        return divi;
    }
}
//    public static void show(){
//
//    }

//
//    void show(){
//        System.out.println(int minus);
//    }
//}
//
//class JavaSample
//{
//    public static void main(String[] args)
//    {
//
//   }
//}

