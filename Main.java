import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args)throws IOException
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%2==0)
System.out.println(n+" is even");
else
System.out.println(n+" is odd");
}
}
