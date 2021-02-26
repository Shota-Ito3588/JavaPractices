class Car2
{
    int num;
    double gas;

    void setNum(int n)
    {
        num = n;
        System.out.println("ナンバーを" + num + "にしました。");
    }
    void setGas(double g)
    {
        gas = g;
        System.out.println("ガソリン量を" + gas + "にしました。");
    }
    void show() {
        System.out.println("車のナンバー" + num + "です。");
        System.out.println("ガソリン量は" + num + "です。");
    }
}

public class JavaSample29
{
    public static void main(String[] args)
    {
        Car2 car1 = new Car2();

        car1.setNum(1234);
        car1.setGas(20.5);
    }
}
