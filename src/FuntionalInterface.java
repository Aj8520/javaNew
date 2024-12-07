public class FuntionalInterface {
    /*In Java, a functional interface is a special type of
     interface designed for lambda expressions and method references
      and it has exactly one abstract method, but it can also have
       default and static methods. */

    public static void main(String[] args) {

        MathOperation addition= (a, b) -> a +b;
        MathOperation substraction = (a, b) -> a -b;

        System.out.println(addition.operate(5, 7));
        System.out.println(substraction.operate(45, 6));
        
    }

}
