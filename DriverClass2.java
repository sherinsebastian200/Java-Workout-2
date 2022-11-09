class oneBHK{
    float roomArea;
    float hallArea;
    float price;
    public oneBHK(){
    }
    public oneBHK(float roomArea, float hallArea, float price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    void show(){
        System.out.println("Room Area\t" +roomArea);
        System.out.println("Hall Area\t" +hallArea);
        System.out.println("Price\t" +price);

    }
}
class TwoBHK extends oneBHK{
     float room2Area;
     public TwoBHK(){
     }

    public TwoBHK(float roomArea, float hallArea, float price, float room2Area){
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    void show(){
        super.show();
        System.out.println("Room 2 Area: "+room2Area);
    }
}
public class DriverClass2{
    public static void main(String args[]){
        TwoBHK o1 = new TwoBHK(230,2345,789,38);
        TwoBHK o2 = new TwoBHK(346,1545,678,58);
        TwoBHK o3 = new TwoBHK(567,4657,978,48);
        o1.show();
        System.out.println("\n");
        o2.show();
        System.out.println("\n");
        o3.show();
        System.out.println("\n");
        System.out.println("Total amount of all flats:\t"+ (o1.price+o2.price+ o3.price));
    }
}