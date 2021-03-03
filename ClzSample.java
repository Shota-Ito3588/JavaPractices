//クラス
//
//        - クラスとは「データ」と「処理」をまとめて持っているもの
//
//        定義方法
//
//        ```
//        [アクセス修飾子] class [クラス名] { }
//
//        ```
//
//        - アクセス修飾子
//        - public
//    - protected（同パッケージor継承先）
//        - private（自分自身のみ）
//
//        - クラス名
//        - 先頭大文字で区切りが大文字
//
//        SuperCar


public class ClzSample {



    // メソッド 四角形の面積
    public int getArea(int height, int width) {
        int area = height * width;
        return area;
    }

    // メソッド 三角形の面積
    public int getTriangleArea(int width, int height) {
        int area = width * height / 2;
        return area;
    }

}
