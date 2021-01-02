package pub.maxwellzhu.day3;
//do...while or  while
public class dw {
    public static void main(String[] args) {
        int sum=0,num=1;
        while(num<100){
            sum+=num;
            num++;
        }
        System.out.println(sum);
        int sum1=0,num1=1;
         do {
            sum1+=num1;
            num1++;
        }while(num1<100);
        System.out.println(sum1);
    }
}
