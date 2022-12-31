package ArrayPractice;

public class FibonacchiSeries {
    public static void main(String[] args) {
        FibonacchiSeries f=new FibonacchiSeries();
        f.FibonachiCalculate(8);

    }

    private void FibonachiCalculate(int n ){

        int a=0,b=1;
        int c;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            c=b+a;
            a=b;
            b=c;

        }
    }
}
