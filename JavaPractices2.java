//■STEP2
//        ・表の列数、行数をコマンドラインから受け取り、指定された列数、行数だけ表を表示するようにしましょう。
//        ・コマンドライン引数に指定される値は正の整数のみが与えられるものとし、
//        それ以外の値が入力された場合については考慮しなくてよい。
//
//        例）
//        ruby lesson03.rb 4 8
//        とコマンドライン引数を指定して実行した場合は
//
//        _1|_2|_3|_4|
//        _2|_4|_6|_8|
//        _3|_6|_9|12|
//        _4|_8|12|16|
//        _5|10|15|20|
//        _6|12|18|24|
//        _7|14|21|28|
//        _8|16|24|32|
//
//        と表示されるようにする。

import java.io.*;

public class JavaPractices2 {
    public static void main(String[] args) {
        System.out.println("列数と行数を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

//        String str = br.readLine();
        int res1 = Integer.parseInt(str);
        int res2 = Integer.parseInt(str);

        for(int i=1; i<=res1; i++){
            for(int j=1; j<=res2; j++){
                System.out.print(i*j + "|");
                if(i*j <=9)
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
