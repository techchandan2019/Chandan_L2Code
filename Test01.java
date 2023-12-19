package com.neosoft.test02;
/*You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

 

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"*/
public class Test01 {
	public static void main(String[] args) {
		String s="10#11#12";
		String s1="1326#";
		System.out.println(getString(s));
		System.out.println(getString(s1));
	}
	public static String getString(String s) {
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<s.length()) {
			if(i+2<s.length() && s.charAt(i+2)=='#') {
				int n=Integer.parseInt(s.substring(i,i+2));
				sb.append((char)('a'+(n-1)));
				i=i+3;
			}else {
				int n=Integer.parseInt(s.substring(i,i+1));
				sb.append((char)('a'+(n-1)));
				i++;
			}
		}
		return sb.toString();
	}

}
