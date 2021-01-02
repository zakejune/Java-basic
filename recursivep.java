package pub.maxwellzhu.day3;
import java.math.BigInteger;
public class recursivep {
    public static void main(String[] args) {
        System.out.println(sum(3));
    }
    public static int sum(int num){
        if(num ==1){
            return  factor(1);
        }
        return factor(num-1)+sum(num);
    }
    public static int factor(int num){
        if(num==1){
            return  1;
        }
        return  num*factor(num-1);
    }
}
