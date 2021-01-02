package pub.maxwellzhu.day3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class whil {
    public static void main(String[] args) {
        int sum = 1;
        int num = 0;
        for (; num < 100; ) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
