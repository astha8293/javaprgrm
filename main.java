public class main
{
	public static void main(String[] args){
		MyClass ref = new MyClass();
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();
	}
}


class MyClass{
	float a=20, b=5;
	void add(){
		System.out.println("Sum = " +(a+b));
	}
	void sub(){
		System.out.println("Subtraction = " +(a-b));
	}
	void mul(){
		System.out.println("Multiplication = " +(a*b));
	}
	void div(){
		System.out.println("Division = " +(a/b));
	}
}

