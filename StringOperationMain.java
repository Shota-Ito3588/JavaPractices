public class StringOperationMain {

    public static void main(String[] args) {

        StringOperation ope = new StringOperation();
        String front = ope.getPostalCodeFront("899-0999");
        String back = ope.getPostalCodeBack("899-0999");

    }
}
