import java.util.Scanner;
class A{
    void eval(int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
                
            }
                
        }
    }
}
public class even{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
       
        A a1=new A();
        System.out.println("Even numbers between " + a + " and " + b + " are:");
        a1.eval(a,b);
        sc.close();
    }
    
}