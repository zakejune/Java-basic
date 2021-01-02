package pub.maxwellzhu.day3;
//方法重载：方法名字相同但是参数类型不同，在进行方法重载时大多数的程序都会统一方法的返回值类型以避免混淆问题
public class methodreload {
    public static void main(String[] args) {
          int result=sum(4,3,4);
          int result1=sum(2,5);
          int result2=sum(2.64,7.16);
        System.out.println("result is "+result);
        System.out.println("result is "+result1);
        System.out.println("result is "+result2);
    }
    public static   int sum(int x,int y){
        return  x+y;
    }
   public static int sum(int x,int y,int z){
        return x+y+z;
   }
   public static int sum(double x,double y){
        return (int) (x+y);
   }
}

