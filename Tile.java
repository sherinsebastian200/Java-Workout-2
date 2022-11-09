import java.util.Scanner;
class Tile{
    int edgelength;
    int area;
    Tile(int edgelength){
        this.edgelength=edgelength;
        this.area=edgelength*edgelength;
    }
    int getArea()
    {

        return area;
    }
}
class Floor{
    int length;
    int width;
    Floor(int length, int width){
        this.length = length;
        this.width = width;
    }
    void totalTiles(Tile t){
        double tileArea = t.getArea();
        double floorArea = length*width;
        double noOfTiles = floorArea/tileArea;
        System.out.println("whole number of tiles needed to cover the floor completely: "+noOfTiles);
    }
}
class Totaltiles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Tile: ");
        int tileLength = sc.nextInt();
        Tile t = new Tile(tileLength);
        System.out.println("Enter the length and width of Floor: ");
        int fLength = sc.nextInt();
        int fWidth = sc.nextInt();
        Floor f = new Floor(fLength,fWidth);
        f.totalTiles(t);
    }
}