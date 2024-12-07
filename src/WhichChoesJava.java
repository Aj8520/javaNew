

public class WhichChoesJava {

/*In Java, there are two types of data types: primitive types and wrapper types.

1. Primitive Types:
• These are the most basic data types in Java.
• They are not objects; they are stored directly in memory as values.
• Examples include int, char, float, double, boolean, etc.

2. Wrapper Types:
• These are objects that encapsulate primitive types.
• They are part of the Java API and are used when an object is required (e.g., in collections like ArrayList or when using generics).
• Examples include Integer, Character, Float, Double, Boolean, etc.
 */   
    public static void main(String[] args) {
        WhichChoesJava obj = new WhichChoesJava();
        obj.sum(5, 6);
        
    }

    public void sum(Integer a, Integer b){
        System.out.println("sum form wrapper args:" + (a + b));
    }

    public void sum (int a, int b){
        System.out.println("Sum from primitive args:" + (a + b));
    }

}
