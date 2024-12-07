public class swaptwonumber {
    public static void main(String[] args) {

        //swap the values without using temp variable
        // using bitwise xor

        int c = 5; //binary :0101
        int d = 10; //binary :1010

        System.out.println("value of c = " + c);
        System.out.println("value of d =" + d);

        c = c^d;// c becomes 1111^XOR of 0101 and 1010)
        d = c^d; // d becomer 0101(xOR of 1111 and 1010)
        c = c^d; // c becomes 1010(XOR of 111 and 0101)

        System.out.println("value of c =" +c);
        System.out.println("value of d=" +d);


        //Swap the values without using temp variable
        // using arithmetic operations
        int a = 10, b=50;
        System.out.println("value of a ="+ a);
        System.out.println("value of b = "+ b);
        System.out.println("using arithmetic operations");
        a=a+b -(b=a);
        System.out.println("value of a =" + a);
        System.out.println("value of b = " + b);

        
    }

}
