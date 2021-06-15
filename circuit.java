public class circuit
{
	public static void main(String[] args){
		int a=25,b=15,c=7;
		if (a>=b && a>=c)
		{
			System.out.println("largest is  " +a);
		}
		else if (b>=a || b>=c)
		{
			System.out.println("largest is  " +b);
		}
		else
		{
			System.out.println("largest is  " +c);
		}
	}
}