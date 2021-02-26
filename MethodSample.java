public class MethodSample {


    public static void main (String[] args) {

        // 三角形の面積
        int length = 4;
        int height = 6;


        // 底辺が4、高さが6の三角形の面積を出す
//        int area1 = MethodSample.getArea(length, height);

        int area = 0;

//        System.out.println(area1);

        for (int i = 0; i < 5; i++) {
            length = length + 1;
            height = height + 1;
            area = MethodSample.getArea(length, height);

//            System.out.println(length);
//            System.out.println(height);
//            System.out.println(area);
        }

        int ans = MethodSample.plus(2, 2);

        System.out.println(ans);

        MethodSample.show();


    }

    public static int getArea(int length, int height) {

        int ans = length * height / 2;

        return ans;
    }

    // 足し算
    public static int plus(int a, int b) {
        int ans = a + b;


        return ans;
    }

    public static void show() {

    }


}
