import java.util.*;
class SubarrayDivision
{
    public static void main(String[] r)
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<=size-1;i++)
        {
            arr[i]=s.nextInt();
        }
        int d=s.nextInt();
        int m=s.nextInt();
        int k=1,c=0;
        if(size==1)
        {
            if(arr[0]==d)
            {
                c++;
            }
          System.out.println(c);
        }
        else{
        for(int j=0;j<=size-1;j++)
        {
            if(arr[j]+arr[k]==d)
            {
                c++;
                k++;
            }
        }
        System.out.println(c);
    }
    }
}