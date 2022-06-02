import java.util.*;
class Descending_order{
    public static void main(String args[])
    {
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            for(int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
            n-=1;
        }
    }
}