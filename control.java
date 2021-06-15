public class control
{
	public static void main(String[] args){
		int a=1,b=6;
		System.out.println("IF ELSE\n");
		if (a>=1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		System.out.println("\nSWITCH CASE\n");
		switch(a){
			case 0:
				System.out.println("x");
				break;
			case 1:
				System.out.println("y");
				break;
			default:
				System.out.println("Not 0 , Not 1");
		}
		System.out.println("\nWHILE\n");	
		while (a < 5){
			System.out.println(a);
			a++;
		}
		System.out.println("\nDO WHILE\n");
		do{
			System.out.println(b);
			b++;
		}while(b<10);
		System.out.println("\nFOR\n");
		for(a=0;a<20;a++)
		{
			System.out.println(a);
		}


	}
}