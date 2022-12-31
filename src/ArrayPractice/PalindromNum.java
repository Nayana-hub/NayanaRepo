package ArrayPractice;

public class PalindromNum {
    public static void main(String[] args) {
        int num=12145;
        int temp,revno=0,rem;
        temp=num;
        while(num!=0){
            rem=num%10;
            revno=revno*10+rem;
            num=num/10;
        }
        if(temp==revno){
            System.out.println("palindrome ");
        }
        else
            System.out.println("Not Palindrome ");
    }
}
