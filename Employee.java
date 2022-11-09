import java.util.Scanner;
abstract interface Exam
{
    void percent_cal();
}
class emp
{
    int empid;
    String name;
    int ass1,ass2,ass3;
    emp(int id,String n,int m1,int m2,int m3)
    {
        empid=id;
        name=n;
        ass1=m1;
        ass2=m2;
        ass3=m3;
    }
    void show()
    {
        System.out.println("Employee Details");
        System.out.println("Employee Id:"+empid);
        System.out.println("Employee Name:"+name);
        System.out.println("Assessment 1:"+ass1);
        System.out.println("Assessment 2:"+ass2);
        System.out.println("Assessment 3:"+ass3);
    }
}
class Result extends emp implements Exam{
    float per;int total;
    Result(int id,String n,int m1,int m2,int m3)
    {
        super(id,n,m1,m2,m3);
    }

    @Override
    public void percent_cal() {
        total = ass1 + ass2 + ass3;
        per = (float) total / 3;
    }
    void display()
    {
        show();
        System.out.println("Total:" +total);
        System.out.println("Percentage:" + per);
        if(total>=75) {

            System.out.println("Result:Promoted");
        }
        else{
            System.out.println("Result:Demoted");
        }
    }

}
public class Employee {
    public static void main(String[] args)
    {
        int id,mark1,mark2,mark3;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee Id:");
        id= sc.nextInt();
        System.out.println("Enter employee Name:");
        name= sc.next();
        System.out.println("Assessment mark 1:");
        mark1= sc.nextInt();
        System.out.println("Assessment mark 2:");
        mark2= sc.nextInt();
        System.out.println("Assessment mark 3:");
        mark3= sc.nextInt();
        Result r=new Result(id,name,mark1,mark2,mark3);
        r.percent_cal();
        r.display();

    }
}
