//# ■STEP1
//        # ・配列arr1を作成しましょう。要素数と値は何でも大丈夫です。（数値でも文字でもOK)
//
//        # ・空の配列arr2を作成しましょう。
//
//        # ・配列arr1の内容を「順番を逆にして」配列「arr2」にコピーしましょう。
//
//        # ・配列arr2の内容を出力して確認しましょう。
//
//        # ・arr1の配列の要素数や値を色々と変更して、プログラムが正しく動作するか確認してください。
//        # （要素数が偶数個、奇数個でもうまく動くか等）
//
//        # 例）
//        # arr1 = ['dog', 'cat', 'lion', 'monkey', 'human']
//        # だった場合は
//        # arr2 = ['human', 'monkey', 'lion', 'cat', 'dog']
//        # となるように
//
//        arr1 = ["red", "blue", "yellow", "pink", "black", "green"]
//        arr2 = []
//        i = arr1.length - 1
//        j = 0
//        while i >= 0
//        #   p i
//        #   p arr1[i]
//        arr2[j] = arr1[i]
//        i -= 1
//        j += 1
//        end
//        p arr2

public class JavaPractices3
{
    public static void main(String[] args)
    {
        String[] arr1 = {"red","blue","yellow","pink","green"};
        String[] arr2 = new String[arr1.length];

//        for(int i=0; i<10; i++){
//
//        }

        for(int i=0; i< arr1.length; i++) {
            int index= arr1.length-i-1;
            System.out.println(index);
            System.out.println(arr1[index]);
//            for(int j=0; j=; j++){
//                String arr2[j] = String arr1[i];
//            }
            arr2[i] = arr1[index];

        }
        System.out.println("______");
        for(int i=0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.print(arr2);
    }
}
