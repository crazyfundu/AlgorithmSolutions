package com.crazyfundu.github.algorithmsolutions.bitmanipulation;

public class FloatiNgnumberBinary {
	public static void main(String[] args) {
		floatingBinary("17.1");
	}
	
	public static void floatingBinary(String n){
		if(!n.contains("x")){
			String intPart = n.substring(0,n.indexOf("."));
			intConvertToBinary(intPart);
			String decPart = n.substring(n.indexOf("."));
			decConvertToBin(decPart);
		}else{
			System.out.println("Dude, It is not even floating number");
		}
	}

	private static void decConvertToBin(String decPart) {
		if(decPart.length() >32){
			System.out.println("Error");
			return;
		}
		StringBuilder sbr  = new StringBuilder();
		double temp = Double.parseDouble(decPart);
		
		while(temp > 0){
			if(temp ==1){
				sbr.append(1);
				break;
			}
			temp = temp * 2;
			if(temp > 1){
				sbr.append(1);
			}else{
				sbr.append(0);
			}
		}
		System.out.println(sbr);
	}

	private static void intConvertToBinary(String intPart) {
		StringBuilder sbr = new StringBuilder();
		int temp = Integer.parseInt(intPart);
		int rem;
		while(temp != 1){
			rem = temp%2;
			temp = temp/2;
			sbr.append(rem);
		}
		sbr.append(temp);
		System.out.println(sbr.reverse());
	}
}
