package pub.maxwellzhu.day3;
//method 即C/C++中的function
public class method {
    public static void main(String[] args) {
        printinfo();
        sale(-2);
        sale(8 );
    }
        public static void printinfo () {
            System.out.println("nameL xijingping"); //
            System.out.println();
            System.out.println("location: southchinasea\n");
            System.out.println("chairman  主席");
            String result = payAndget(20.0);
            System.out.println(result);
            System.out.println(payAndget(5.2));

        }

        public static  String payAndget(double  money){
        if(money >= 10.0){
            return "购买一份快餐找零："+ (money-10.0);
        }
        else{
            return "余额不足，请补充："+ (10.0-money);
        }
        }
        public static  void sale(int amount){
        if(amount <= 0){
            return;      //return 结束调用方法
        }
            System.out.println("sale amount is "+amount+" books");
        }
    }

