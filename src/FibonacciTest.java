public class FibonacciTest {
    public static void main(String[] args) {

        FibonacciTest f = new FibonacciTest();
        f.FibonacchiShow(10);
    }

    private void FibonacchiShow(int no) {
        int a = 0, b = 1, c = 1;
        for (int i = 1; i <= no; i++) {
            System.out.println(a + ",");
            a = b;
            b = c;
            c = a + b;

        }

    }
}
