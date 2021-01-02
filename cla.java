package pub.maxwellzhu.day3;
//对象引用递归
class person{
    String name;
    int age;
    public void tell(){
        System.out.println("name is: "+name+", age is: "+age);
    }
}
public class cla {
    public static void main(String[] args) {

        person per = new person();
        per.name = "peter";
        per.age = 21;
        per.tell();

        person per1=new person();
        per1.name ="jack";
        per1.tell();

        person per2=per;
        per2.age=23;
        per2.tell();
    }
}