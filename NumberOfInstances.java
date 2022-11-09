public class NumberOfInstances
{
     static int count;
     static int id;

    public NumberOfInstances()
    {

        count++;
    }
    public static void main(String[] args) {
        NumberOfInstances a1 = new NumberOfInstances();
        NumberOfInstances a2 = new NumberOfInstances();
        NumberOfInstances a3 = new NumberOfInstances();
        NumberOfInstances a4 = new NumberOfInstances();
        a1 = null;
        a2 = null;
        Runtime.getRuntime().gc();
        System.out.println("Object created: " + count);
        System.out.println("Object destroyed: " + id);
        System.out.println("Object alive: " + (count - id));
    }
    protected void finalize()
    {
        id++;
    }

}









