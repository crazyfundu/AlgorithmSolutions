package com.crazyfundu.github.algorithmsolutions.moderate;

import java.util.HashMap;
import java.util.Map;

public class NumberToWords {

	static StringBuffer str = new StringBuffer();
	static Map<Character, String> doubleMap = new HashMap<Character, String>();
	static Map<Character, String> singleMap = new HashMap<Character, String>();
	static Map<String, String> twoMap = new HashMap<String, String>();
	public static void main(String[] args) {
		doubleMap.put('9', "Ninety ");
		doubleMap.put('8', "Eighty ");
		doubleMap.put('7', "Seventy ");
		doubleMap.put('6', "Sixty ");
		doubleMap.put('5', "Fifty ");
		doubleMap.put('4', "Fourty ");
		doubleMap.put('3', "Thirty ");
		doubleMap.put('2', "Twenty ");
		doubleMap.put('1', "One ");
		doubleMap.put('0', "");
		 
		singleMap.put('9', "Nine ");
		singleMap.put('8', "Eight ");
		singleMap.put('7', "Seven ");
		singleMap.put('6', "Six ");
		singleMap.put('5', "Five ");
		singleMap.put('4', "Four ");
		singleMap.put('3', "Three ");
		singleMap.put('2', "Two ");
		singleMap.put('1', "One ");
		singleMap.put('0', "");
		
		twoMap.put("10", "Ten");
		twoMap.put("11", "Eleven");
		twoMap.put("12", "Twelve");
		twoMap.put("13", "Thirteen");
		twoMap.put("14", "Fourteen");
		twoMap.put("15", "Fifteen");
		twoMap.put("16", "Sixteen");
		twoMap.put("17", "Seventeen");
		twoMap.put("18", "Eighteen");
		twoMap.put("19", "Ninteen");
		twoMap.put("20", "Twenty");
		
		System.out.println(printWords("100"));
		

	}

	public static String printWords(String n){
		if(n==null){
			System.out.println("Not a valid scenario");
			return null;
		}
		if(Integer.parseInt(n) < 21){
			return twoMap.get(n);
		}
		int length = 0;
		if((length=n.length())==0){
			System.out.println("Not a valid scenario");
			return null;
		}
        n = makeItsLengthSix(n);
        if(n.equals("000000")){
          return "Zero";
       }
       StringBuilder str = new StringBuilder();
           int temp = length;
           while(temp>0){
              switch (6-temp) {
                 case 0:
                         str.append(doubleMap.get(n.charAt(0)));
                         break;
                 case 1:
                         String c;
                         if(n.charAt(0)=='0'){
                                 c= "";
                         }else{
                                 c = "Lakh ";
                         }
                         str.append(singleMap.get(n.charAt(1))+c);
                                   break;
                 case 2:
                         str.append(doubleMap.get(n.charAt(2)));
                         break;
                 case 3:
                         String a;
                         if(n.charAt(2)=='0'){
                                 a= "";
                         }else{
                                 a = "Thousand ";
                         }
                         str.append(singleMap.get(n.charAt(3))+ a);
                         break;
                 case 4:
                         String b;
                         if(n.charAt(3)=='0'){
                                 b= "";
                         }else{
                                 b = "Hundred ";
                         }
                         str.append(doubleMap.get(n.charAt(4))+b);
                         break;
                 case 5:
                        if(n.charAt(5)!='0'){
                         str.append(singleMap.get(n.charAt(5)));
                         break;
                        }
                 
              }
              temp--;
            }
           return str.toString();
           }

           private static String makeItsLengthSix(String n) {
                   while(n.length()!=6){
                           n = "0"+n;
                   }
                   return n;
           }
}
      