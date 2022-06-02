import java.util.*;
class If_else{
    public static void main(String args[])
    {
        int a=0;
        int b=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A");
        a=sc.nextInt();
        System.out.println("Enter B");
        b=sc.nextInt();
        System.out.println("Enter choice");
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Modulo");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.print("Addition is: ");
            System.out.println(a+b);
        }
        if(choice==2)
        {
            System.out.print("Subtraction is: ");
            System.out.println(a-b);
        }
        if(choice==3)
        {
            System.out.print("Multiplication is: ");
            System.out.println(a*b);
        }
        if(choice==4)
        {
            System.out.print("Modulo is: ");
            System.out.println(a%b);
        }
    }
}