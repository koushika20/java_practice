import java.util.Scanner;
class A{
    void eval(int a,int b)
    {
        int res=a+b;
        System.out.print(res);
       // return res;
    }
}
public class sum{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        A a1=new A();
        a1.eval(a,b);
        sc.close();
    }
    
}