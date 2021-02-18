import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLesson11
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("２つの整数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        if(num1 < num2) {
            System.out.println(num1 + "より" + num2 + "の方が大きい値です。");
        }
        else if(num1 > num2) {
            System.out.println(num2 + "より" + num1 + "の方が大きい値です。");
        }
        else {
            System.out.println("２つの数は同じ値です。");
        }
    }
}
