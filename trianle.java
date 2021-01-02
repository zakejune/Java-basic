package pub.maxwellzhu.day3;

public class trianle {
    public static void main(String[] args) {
        int line=7;
        for(int x=0;x<line;x++) {
            for(int y=0;y<line-x;y++){
                System.out.println(" ");
            }
            for(int y=0;y<x;y++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
