package com.PS;
/*
 * A = [2, 5, 6]
B = 0
C = 2
6 5 2
 */
class Soultion2{
	public void solve(int[] A,int start,int end) { //A=1 2 4 3 2,4
		while (start<end) { //3<2
			int temp=A[start]; // 4
			A[start]=A[end];// 3
			A[end]=temp;//4
			start+=1;
			end-=1;
				
		}
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
}
public class ReverseInArray {
public static void main(String[] args) {
	Soultion2 s2=new Soultion2();
	int[] A= {1, 2, 4, 3};
	int B=2;
	int C=3;
	s2.solve(A, B, C);
}
}
