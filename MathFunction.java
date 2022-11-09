public class MathFunction {
    static float multiply (int a, int b)
    {
        return (a*b);
    }
    static float multiply (float a, float b)
    {
        return (a*b);
    }
    static float multiply(float a,int b)
    {
        return (a*b);
    }
    public static void main(String[] args)
    {
        System.out.println(multiply(3, 2));

        System.out.println(multiply(3.1f, 2.1f));

        System.out.println(multiply(2.1f, 4));
    }
}
