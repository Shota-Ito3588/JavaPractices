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



//        メソッド: 足し算して引き算
//        引数: target1, target2, target3
//        戻り値: int
//
//        メソッド: 足し算して掛け算
//        引数: target1, target2, target3
//        戻り値: int
//
//        メソッド: 引き算して掛け算
//        引数: target1, target2, target3
//        戻り値: int
//
//        メソッド: 足し算して引き算して掛け算
//        引数: target1, target2, target3, target4
//        戻り値: int

public class Calucurator {

    public static void main(String[] args) {

        int ans = Calucurator.plus(2, 3);
        int ans1 = Calucurator.minus(5, 2);
        int ans2 = Calucurator.mul(5, 2);
        int ans3 = Calucurator.plus(4, 4);
        int ans4 = Calucurator.minus(4, 4);
        int ans5 = Calucurator.divi(10,5);
        int ans6 = Calucurator.plusMinus(10, 5, 6);
        int ans7 = Calucurator.plusMul(2, 3, 6);
        int ans8 = Calucurator.minusMul(3, 2, 5);
        int ans9 = Calucurator.plusMinusMul(2, 5, 3, 2);

        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);
        System.out.println(ans6);
        System.out.println(ans7);
        System.out.println(ans8);
        System.out.println(ans9);

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

    public static int plusMinus(int target1, int target2, int target3) {
        int plusMinus = target1 + target2 - target3;
        return plusMinus;
    }

    public static int plusMul(int target1, int target2, int target3) {
        int plusMul = (target1 + target2) * target3;
        return plusMul;
    }

    public static int minusMul(int target1, int target2, int target3) {
        int minusMul = (target1 - target2) * target3;
        return minusMul;
    }

    public static int plusMinusMul(int target1, int target2, int target3, int target4) {
        int plusMinusMul = ((target1 + target2) - target3) * target4 ;
        return plusMinusMul;
    }
}
