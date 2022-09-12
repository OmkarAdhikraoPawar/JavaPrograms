package ForEachLoopArray;

import java.util.Arrays;

public class ForEach2D {
	public void show(int a[][])
	{
		for(int[]arr : a)
		{
			//System.out.println(Arrays.toString(arr));
			for(int x : arr)
			System.out.print(x+ " ");
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
		
		ForEach2D o = new ForEach2D();
		o.show(a);

	}

}
