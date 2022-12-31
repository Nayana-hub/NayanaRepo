package CustomEXceptiontest;

class myException extends Exception{
public myException (String s){
    super(s);
}
}
public class CustomexceptionExample {


    public static void main(String[] args) {

try{
    System.out.println("Exception in try block");
    throw new myException("MyException");
} catch (myException e) {

    System.out.println(e.getMessage());
}

    }
}
