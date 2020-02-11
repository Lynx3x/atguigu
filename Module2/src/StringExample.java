/**
 * @author larynx
 * @create 2020-02-11 11:01
 */
public class StringExample {

    public static void main(String[] args) {
        //练习1
        char c = 'a';
        int num = 10;
        String str = "hello";

        //字符串参与运算时，转换为字符串
        //char类型与int类型执行相加操作
        System.out.println(c + num + str);      //107hello
        System.out.println(c + str + num);      //ahello10
        System.out.println(c + (num + str));    //a10hello
        System.out.println((c + num) + str);    //107hello
        System.out.println(str + num + c);      //hello10a

        //练习2
        //*    *
        System.out.println("*   *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));
        System.out.println("*的ASCII码值为" + (int)'*');
        System.out.println("制表符的ASCII码值为" + (int)'\t');
    }
}
