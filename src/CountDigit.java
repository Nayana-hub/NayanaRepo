public class CountDigit {
    public static void main(String[] args) {
        CountDigit c = new CountDigit();
        int r=c.CalulteDigit(434565656);
        System.out.println("No of digits ="+r);
    }

    private int CalulteDigit(int no) {
        int cnt = 0;
        if (no == 0) {
            return 1;
        }
        if (no < 0) {
            return 0;
        }
        while (no != 0) {
            no = no / 10;
            cnt++;
        }
        return cnt;

    }

}