package pub.maxwellzhu.day3;
//打印乘法表
public class printable {
    public static void main(String[] args) {
        for(int x=1;x<=9;x++){
            for(int y=1;y<=x;y++){
                System.out.println(y+"*"+x+"="+(x*y)+"\t");
            }
            System.out.println();  //换行
        }
    }
}
