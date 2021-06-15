import java.lang.Math;

public class E2{
public static void main(String args[]) {
    int[][] arr = new int[3][3];
    for (int i = 0; i < arr.length; i++) {
        
        for (int j = 0; j < arr.length; j++) {
            arr[i][j] =(int)Math.random();
            
        }
	}
	for (int i = 0; i < arr.length; i++) {
        
        	for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[i][j]+" ");
	}  
	} 
        System.out.println();
    	}
}

