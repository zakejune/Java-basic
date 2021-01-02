package pub.maxwellzhu.day3;

public class factorial {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += m1(i);
            //sum += m2(i);

        }
        System.out.println(sum);
    }

    //求阶乘 方法一
    private static int m1(int n) {
        if (n == 1) return 1;
        return n *= m1(n - 1);
    }

    //求阶乘 方法二
    public static int m2(int n) {
        if (n == 1) {
            return 1;
        }
        int i = 1;
        int res = 1;
        while (i <= n) {
            res *= i;
            i++;
        }
        return res;
    }
}
