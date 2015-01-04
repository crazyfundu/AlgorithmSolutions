package com.crazyfundu.github.algorithmsolutions.bitmanipulation;

public class BitReplacement {
	static int n;
	static int m;
	static int j;
	static int i;
	public BitReplacement(int n, int m, int i, int j) {
		this.n = n;
		this.i = i;
		this.j = j;
		this.m = m;
	}
	public static void main(String[] args) {
		BitReplacement br = new BitReplacement(1024,13, 7, 11);
		modify();
		System.out.println(updateBits(1024, 13, 7, 11));
	}
	private static void modify() {
		StringBuilder sn = new StringBuilder(Integer.toBinaryString(n));
		StringBuilder sm = new StringBuilder(Integer.toBinaryString(m));
		System.out.println(sn.toString());
		System.out.println(sm.toString());
		if((j-i+1) < sm.length()){
			System.out.println("Wrong entry");
			return;
		}
		if((sn.length()-i) < (sm.length())){
			System.out.println("Range overflows");
			return ;
		}
		if((i-j+1)>sm.length()){
			System.out.println("Input not right");
			return;
		}
		sn.replace(i, j, sm.toString());
		System.out.println(sn.toString());
	}
	
	public static int updateBits(int n, int m, int i, int j) {
		int max = ~0; /* All 1’s */
		System.out.println(Integer.toBinaryString(max));
		
		// 1’s through position j, then 0’s
		int left = max - ((1 << j) - 1);
		System.out.println(Integer.toBinaryString(left));
		
		// 1’s after position i
		 int right = ((1 << i) - 1);
		System.out.println(Integer.toBinaryString(right));
		
		 // 1’s, with 0s between i and j
		 int mask = left | right;
		System.out.println(Integer.toBinaryString(mask));
		
		 // Clear i through j, then put m in there
		int res = (n & mask) | (m << i);
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(res));
		 return res;
		 }
	
}

















