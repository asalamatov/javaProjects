package ClassFolder;

public class calculateArea {
    public static void main(String[] args) {
        newClass r1 = new newClass(100, 50) ;
        newClass r2 = new newClass(20, 80);

        int area1 = r1.width*r1.height;
        System.out.println(area1);

        int area2 = r2.width * r2.height;
        System.out.println(area2);

        r1.width += 50; r1.height+=10;
        r2.width +=5; r2.height+=30;

        System.out.println("r1: " + r1.width + "x" + r1.height);
        System.out.println("r2: " + r2.width + "x" + r2.height);

    }
}
