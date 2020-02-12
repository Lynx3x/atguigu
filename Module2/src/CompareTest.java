/**
 * @author larynx
 * @create 2020-02-12 14:43
 */
public class CompareTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println(i == j); //false,判断 i 是否等于 j
        System.out.println(i = j);  //20，将 j 赋值给 i ，然后输出 i 的值

        int x = 1, y = 1;
        if((x++ == 2) & (++y == 2)){    //逻辑与，前值为false时仍然执行后面++y == 2 的判断
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);
        x = 1;
        y = 1;
        if((x++ == 2) && (++y == 2)){   //短路与，前值为false时跳过后面判断
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);
    }
}

/*
逻辑比较符和短路比较符的区别
 */
class Test{
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        short z = 42;

        if((z++==42)&&(y=true))z++;
        if((x=false)||(++z==45))z++;

        System.out.println("z=" + z);   //z = 46
    }
}

/*
位运算符,操作对象为整形
<< : 在一定范围内，每向左移一位，相当于 * 2
>> : 在一定范围内，每向右移一位，相当于 / 2

面试题：最高效的计算2 * 8的方式？ 2 << 3 或 8 << 1
 */
class BitTest{
    public static void main(String[] args) {
        int i = 21; //二进制表示为0b10101
        System.out.println("i << 2 :" + (i << 2));
        System.out.println("i << 3 :" + (i << 3));
        System.out.println("i << 27 :" + (i << 27));    //符号位变为1，因此变为其他负数

        i = -21;
        System.out.println("i >> 3 :" + (i >> 3));      //右移时，正数补零，负数补一
        System.out.println("i >>> 3" + (i >>> 3));      //无符号右移，无论正负统一补零

        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1=" + num1 + ", num2=" + num2);

        //方式一：定义临时变量的方法
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //方式二:优点：不用定义临时变量
        //弊端：①相加操作可能超出存储范围 ②有局限性：只能适用于数值类型
        num1 = num1 + num2;
        num2 = num1 - num2; //此时num1为原本的num1 + num2，减去num2后即为原来的num1
        num1 = num1 - num2; //此时num2为原本的num1，减去后即为原来的num2，实现交换

        //方式三：使用位运算符
        //m = (m ^ n） ^ n = k ^ n
        //有局限性：只能适用于数值类型
        num1 = num1 ^ num2; //k = m ^ n
        num2 = num1 ^ num2; //m = k ^ n
        num1 = num1 ^ num2; //n = k ^ m

    }
}

/*
三目运算符：又称条件运算符
 */
class Conditional{
    public static void main(String[] args) {
        //获取三个数的最大值
        int a = 12;
        int b = 5;
        int c = 23;

        int max = (a > b ? a : b);
        max = (max > c ? max : c);
        System.out.println(max);
    }
}