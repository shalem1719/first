package first;
import java.util.*;
public class DecimaltoBinary {
public static void main(String arhs[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	String g=Integer.toBinaryString(n);
	System.out.println("Binary format of "+n+" is "+g);
}
}
