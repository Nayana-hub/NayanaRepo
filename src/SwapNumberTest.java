

public class SwapNumberTest {
    public static void main(String[] args) {
        int a=100;
        int b=50;

        System.out.println("Numbers before swap "+"a="+a+"b="+b);
       // b=a;
     a=b%100+a;
     b=a-b;
     a=a-b;
    // a=b%100+a-a;


        System.out.println("Numbers after swap "+"a="+a+"b="+b);

    }
}
