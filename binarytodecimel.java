/******************************************************************************
BINARY TO DECIMEL CONVERSION
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int decimel=0,power=0;
		while(num>0){
		    int lastdigit=num%10;
		    decimel=decimel+(int)(lastdigit*Math.pow(2,power));
		    num/=10;
		    power++;
		}
		System.out.print(decimel);
	}
}
