# SeedNumber
import java.util.Scanner;

public class SeedNumber {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value of X and Y");
		int n1=scanner.nextInt();
		int c=scanner.nextInt();
		
		int n=n1;
		int b=0;
		int result=n1;
		int len=Integer.toString(n).length();
		for(int i=0;i<len;i++){
			b=n%10;
			//System.out.println(b);
			result*=b;
			n=n/10;
		}
		if(result==c){
			System.out.println("seed");
		}
		else{
			System.out.println("not seed");
		}
}
}
