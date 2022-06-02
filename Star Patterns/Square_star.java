
import java.util.*;
class Square_Star {
    public static void main(String args[])
    {
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        while(t<n)
        {
            for(int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
            t+=1;
        }
    }
}