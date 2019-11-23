package com.number;

import java.util.HashMap;

public class Number {

	private static HashMap<Integer,String> numbers = new HashMap<>();
	static
	{
		numbers.put(0,"");            numbers.put(11,"Eleven");
		numbers.put(1,"One");         numbers.put(12,"Twelve");
		numbers.put(2,"Two");         numbers.put(13,"Thirteen");
		numbers.put(3,"Three");       numbers.put(14,"Fourteen");
		numbers.put(4,"Four");        numbers.put(15,"Fifteen");
		numbers.put(5,"Five");        numbers.put(16,"Sixteen");
		numbers.put(6,"Six");         numbers.put(17,"Seventeen");
		numbers.put(7,"Seven");       numbers.put(18,"Eighteen");
		numbers.put(8,"Eight");       numbers.put(19,"Nineteen");
		numbers.put(9,"Nine");        numbers.put(10,"Ten");
		
		numbers.put(20,"Twenty");     numbers.put(30,"Thirty");
		numbers.put(40,"Forty");      numbers.put(50,"Fifty");
		numbers.put(60,"Sixty");      numbers.put(70,"Seventy");
		numbers.put(80,"Eighty");     numbers.put(90,"Ninety");  
	}
	
	private static HashMap<Integer,String> tens = new HashMap<>();
	static
	{
		tens.put(1,"");
		tens.put(3,"Hundred");
		tens.put(4,"Thousand");
		tens.put(6,"Lakh");
		tens.put(8,"Crore");
	}
	
	static String toWords(int num)
	{
		String s = Integer.toString(num);
		String number_in_words="";
		int i=s.length();
		char ch;
		
		while(i>0)
		{
			ch = s.charAt(s.length()-i);
			if(ch!='0')
			{
				if( ch=='1' && ((i!=3 && i%2!=0) || i==2) )
				{
				    int n = Integer.parseInt(s.substring(s.length()-(i),(s.length()-(--i))+1));
				    number_in_words += numbers.get(n)+" ";
				}else {
					
			        if( (i%2!=0 && i!=3) || i==2)
			        {
			    		number_in_words += numbers.get(Character.getNumericValue(ch)*10) + " ";
				    	i--;
			        }	
			    	number_in_words += numbers.get(Character.getNumericValue(s.charAt(s.length()-i))) + " ";
				} 
				number_in_words += tens.get(i)+" ";
			}
			i--;
		}
		
		return number_in_words;
	}
}
