//# ■STEP2
//        # ・STEP1のプログラムからarr2を削除しましょう。
//
//        # ・配列arr1の内容を「順番を逆にして」配列「arr1」に格納しましょう。
//
//        # ・使ってよい配列はarr1のみとします。
//        # (arr1を直接操作して順番を入れ替えてください）
//
//        # ・arr1の内容を出力して確認しましょう。
//
//        #　０番目の要素を作成した変数に退避させる
//        #　５番目を０番目に代入する　（上書きをするが０番目の要素は消えないようにする→変数を作ってそこに退避させている）
//        #　退避させた０番目を５番目に代入
//        #　１番目の要素を作成した変数に退避させる
//        #　４番目を１番目に代入する
//        #　退避させた１番目を４番目に代入
//        #　２番目の要素を作成した変数に退避させる
//        #　３番目を２番目に代入する
//        #　退避させた２番目を３番目に代入
//        #　以上の順番で３回ループさせる
//
//        arr1 = ["red", "blue", "yellow", "pink", "black", "green"]
//        i = 0
//        j = arr1.length - 1
//        while i < arr1.length / 2
//        color = arr1[i]
//        arr1[i] = arr1[j]
//        arr1[j] = color
//        i += 1
//        j -= 1
//        end
//        p arr1

public class JavaPractices4
{
    public static void main(String[] args)
    {
        String[] arr1 = {"red", "blue", "yellow", "pink", "green"};

        for (int i = 0; i < arr1.length; i++) {
            int index = arr1.length-i;
            String color = arr1[i];

            System.out.println(i);
        }
    }
}
