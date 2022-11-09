public class Medicine{
    public void displayLabel()
    {
        System.out.println("Company : SM Medicals");
        System.out.println("Address : trivandrum ");
    }
}
class Tablet extends Medicine{
    public void displayLabel() {
        System.out.println("store in a cool dry place");
        System.out.println("To be used only under medical supervision");
    }
}
class Syrup extends Medicine{
    public void displayLabel(){
        System.out.println("Dose as directed by the physician");
        System.out.println("Store away from excessive heat");

    }
}
class Ointment extends Medicine {
    public void displayLabel() {

        System.out.println("for external use only");
        System.out.println("Keep tightly closed after use");
    }
}
class TestMedicine {
    public static void main(String[] args) {
        Medicine m[] = new Medicine[10];
        double i = Math.random() * 4;
        int j = (int) i;
        System.out.println(j);
        switch (j) {
            case 1:
                Medicine m1 = new Medicine();
                Tablet t1 = new Tablet();
                m1.displayLabel();
                t1.displayLabel();
                break;
            case 2:
                Medicine m2 = new Medicine();
                Syrup s2 = new Syrup();
                m2.displayLabel();
                s2.displayLabel();
                break;
            case 3:
                Medicine m3 = new Medicine();
                Ointment o3 = new Ointment();
                m3.displayLabel();
                o3.displayLabel();
                break;
            default:
                System.out.println("Invalid Choice");

        }
    }
}


