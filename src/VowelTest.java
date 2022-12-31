import java.util.Scanner;

public class VowelTest {
  boolean CheckVowel(String str)  {
    return str.toLowerCase().matches(".*[aeiou].*");
}
    public static void main(String[] args) {
      boolean b;
        VowelTest v=new VowelTest();
     b=   v.CheckVowel("Nayana");
        System.out.println(b);
      b= v.CheckVowel("hfjfhsdsds");
        System.out.println(b);
    }
}
