public class abc{
	static int add(int ...x){
		int res=0;
		for(int i=0;i<x.length;i++){
			res=res+x[i];
		}
		return res;
	}
	public static void main(String[] args){
		System.out.println(add(1,2,4,5));
		System.out.println(add(2,6,0));
		System.out.println(add(4,3,2));
	}
}