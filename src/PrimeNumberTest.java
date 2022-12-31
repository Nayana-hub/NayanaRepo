import java.util.Scanner;

public class PrimeNumberTest {

    Boolean TestNumber(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        if (n == 2)
            return true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter no to check");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        PrimeNumberTest p = new PrimeNumberTest();
        boolean b = p.TestNumber(no);
        if (b == true)
            System.out.println(" Prime");
        else
            System.out.println("  Not Prime");

    }

}
