package com.PS;
class Solution1{
	public int maximum(int[] A) {
		int max=A[0];//-2
		for (int i = 1; i < A.length; i++) {
			if(A[i]>max) { //3>5
				max=A[i];//1
			}
		}
		return max;
	}

	public int minimum(int[] A) {
		int min=A[0];//-2
		for (int i = 1; i < A.length; i++) {
			if(A[i]<min) { //3>5
				min=A[i];//1
			}
		}
		return min;
	}
}
public class Sum_of_Min_Max {
public static void main(String[] args) {
	Solution1 s1=new Solution1();
	int[] A= {-2, 1, -4, 5, 3};
	System.out.println("max is :"+s1.maximum(A));
	System.out.println("min is :"+s1.minimum(A));
	
	System.out.println("sum is:"+(s1.maximum(A)+s1.minimum(A)));
}
}
