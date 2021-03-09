/**
 * 文字列を切り取る
 *
 * メソッド: getPostalCodeFront
 * 引数: 郵便番号の文字列
 * 戻り値: 郵便番号の前
 *
 * メソッド: getPostalCodeBack
 * 引数: 郵便番号の文字列
 * 戻り値: 郵便番号の後
 *
 * ※ 郵便番号の文字列 : '899-0109'
 *
 */
public class StringOperation {

    // 郵便番号の前部分(例 899)を抽出するメソッドをリファレンスにあるメソッドを用いて作る

    public String getPostalCodeFront(String postalCode) {

        String front = postalCode.substring(0, 2);
//        postalCode.indexOf();
        return null;

//        System.out.println(postalCode.substring(0, 2));
    }

    // 郵便番号の後ろ部分(例 0109)を抽出するメソッドをリファレンスにあるメソッドを用いて作る

    public String getPostalCodeBack(String postalCode) {
//        postalCode.lastIndexOf();
        return null;

//        int size = postalCode.length();
//        int cutLength = 4;

//        System.out.println(postalCode.substring(size - cutLength));
    }

}
