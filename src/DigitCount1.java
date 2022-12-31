import java.util.Scanner;

public class DigitCount1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        int d = s.nextInt();
        DigitCount1 dg = new DigitCount1();
        int r = dg.Calculate(no, d);
        System.out.println(r);

    }

    private int Calculate(int no, int d) {
        int cnt = 0, digit;
        if (no == 0 && d == 0)
            return 1;
        if (no < 0)
            no = -no;
        while (no != 0) {
            digit = no % 10;
            if (digit == d)
                cnt++;
            no = no / 10;
        }
        return cnt;
    }
}
