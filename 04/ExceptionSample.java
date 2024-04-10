class ExceptionSample {
    public static void main(String[] args) {
        int a = 1;
        //  try {
        //    System.out.println(a/0);
        // } catch (Exception e) {
        //     System.out.println("Exceptinが発生しました" + e);
        // } catch (ArithmeticException e) {
        //     System.out.println("例外が発生しました" + e);
        // }
        // String[] greet = {"おはようございます", "こんにちは", "こんばんは"};
        // System.out.println(greet[3]);
        try {
            System.out.println(div(3, 0 ));
        } catch (ArithmeticException e) {
            System.out.println("divメソッドで例外発生");
        }
        // System.out.println(div(3, 0 ));
    }
    static int div(int a, int b) throws ArithmeticException {
        return a / b;
    }
}