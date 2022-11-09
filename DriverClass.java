import java.util.Scanner;
class Faculty {
    int facultyid;
    float salary;

    void show() {
        System.out.println("id\t" + facultyid);
        System.out.println("salary\t" + salary);
    }
}
class FullTimeFaculty extends Faculty {
    float basic;
    float allowance;
    void input() {
        System.out.println("enter the id");
        Scanner scn = new Scanner(System.in);
        facultyid = scn.nextInt();
        System.out.println("enter the basic");
        Scanner sc = new Scanner(System.in);
        basic = sc.nextFloat();
        System.out.println("enter the allowance");
        Scanner sc1 = new Scanner(System.in);
        allowance =  sc1.nextFloat();
        salary = basic + allowance;
    }
    void show() {

        System.out.println("basic\t" + basic);
        System.out.println("allowance\t" + allowance);
        super.show();
    }
}
class PartTimeFaculty extends Faculty {
    float hour;
    float rate;
    void input() {
        System.out.println("enter the id");
        Scanner scn = new Scanner(System.in);
        facultyid = scn.nextInt();
        System.out.println("enter the hour");
        Scanner sc = new Scanner(System.in);
        hour = sc.nextFloat();
        System.out.println("enter the rate");
        Scanner sc1 = new Scanner(System.in);
        rate = sc1.nextFloat();
        salary = hour * rate;
    }
    void show() {
        System.out.println("hour\t" + hour);
        System.out.println("rate\t" + rate);
        super.show();
    }
}
public class DriverClass {
    public static void main(String[] args){

    PartTimeFaculty person2 = new PartTimeFaculty();
    FullTimeFaculty person3 = new FullTimeFaculty();
    person3.input();
    person3.show();
    person2.input();
    person2.show();
}
}