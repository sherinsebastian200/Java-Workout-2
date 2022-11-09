class swaps {
    int x, y, temp;
    swaps(int a, int b) {
        x = a;
        y = b;
    }
    void swapps(int x, int y) {
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping by call by value");
        System.out.println("value of x is " + x);
        System.out.println("value of y is" + y);
    }
    void swapps(swaps s) {
        int k = s.x;
        s.x = s.y;
        s.y=k;
        System.out.println("After Swapping by call by reference");
        System.out.println("value of x is " + s.x);
        System.out.println("value of y is " +s.y);
    }
}
public class Swap{
    public static void main(String[] args) {
        swaps c= new swaps(4,6);
        System.out.println("before swapping by call by value x is: "+c.x +"y is: "+c.y);
        c.swapps(4,6);
        System.out.println("\n");
        swaps c1=new swaps(5,8);
        System.out.println("before swapping by call by reference x is: "+c1.x + " y is: "+c1.y);
        c1.swapps(c1);
    }
}
