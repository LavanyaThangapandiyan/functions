package com.function;

public class Letter
{
		public static int count(String s, char c)
		{
		int res = 0;
		for (int i=0; i<s.length(); i++)
		{
		if (s.charAt(i) == c)
		res++;
		}
		return res;
		}

		public static void main(String args[])
		{
		String str= "DEYHADCBZYJKDBCAMNFGGRSRVXHASS";
		char c = 'D';
		System.out.println(count(str, c));
		}
		}
