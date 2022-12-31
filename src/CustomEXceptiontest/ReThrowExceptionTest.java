package CustomEXceptiontest;

public class ReThrowExceptionTest {
    static void fun(){
        try{
            throw new ArithmeticException("Arithmatic exception");
        } catch (ArithmeticException e) {
            System.out.println("In Fun catch block");
      //      throw  e;
        }
    }

    public static void main(String[] args) {
        try{
            fun();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
