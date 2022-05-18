package string;

public class Stringc2 {

	public static void main(String[] args) {
		// String a=new String ();
		// or
		String a = ("Rateofintrest");
		// Returns the number of characters in the String.
		System.out.println("string length: " + a.length());// 13
		// Returns the character at ith index.
		System.out.println("Character at 9rd position = " + a.charAt(8));

		// Return the substring from the ith index character
		// to end of string
		System.out.println(" substring from index 3: " + a.substring(2));

		// Return the substring from o to e;
		System.out.println("substring from o to e:  " + a.substring(4, 10));// ofintr
		System.out.println("substring from t to e:  " + a.substring(2, 11));// teofintre

		// Concatenates string a1 to the end of string a2.
		String a1 = "harshal";
		String a2 = "shital";
		System.out.println("first value of a1: " + a1);// harshal
		System.out.println("first value of a2: " + a2);// shital
		System.out.println(" concatenated string: " + a1.concat(a2));// harshalshital

		// After Concatenates no change the string value
		System.out.println("first value of a1: " + a1);// harshal
		System.out.println("first value of a2: " + a2);// shital

		String b1 = "Mumbai";
		String b2 = "Nashik";

		String x1 = a1.concat(a2);// harshalshital
		String x2 = b1.concat(b2);// MumbaiNashik
		String x3 = b1 + b2;// MumbaiNashik
		String x4 = x1.concat(x2);// harshalshitalMumbaiNashik
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);

		// System.out.println(a1.concat(5));// erroe
		// String z=a1.

		// Returns the index within the string
		// of the first occurrence of the specified string.
		String a3 = "I will be try";
		System.out.println("string length: " + a3.length());// 13
		System.out.println("Index of 'Share' starts from: " + a3.indexOf("will"));// 2
		System.out.println("Index of 'Share' starts from: " + a3.indexOf("be"));// 7
		// starting at the specified index.
		System.out.println("Index of a  = " + a3.indexOf('i', 3));// next occurrence(index) of 'i' after index 3
		System.out.println("Index of e = " + a3.indexOf('e', 8));// next occurrence(index) of 'e' after index 8

		
		System.out.println("last index of will: "+a3.lastIndexOf("will", 7));
		System.out.println("last index of b: "+a3.lastIndexOf("b", 6));
		
		
		 // Checking equality of Strings
        String a4="Selenium"; //capital S
        String a5="selenium";//small s
        String a6="Selenium";
        System.out.println("Checking Equality of a4 & a5: " + a4.equals(a5));//
        System.out.println("Checking Equality of a4 & a6: " + a4.equals(a6));//
        System.out.println("Checking Equality of s6 & s7 with Ignore case: " + a4.equalsIgnoreCase(a6));//

        
        // Converting cases
        String word1 = "Simpleprogram";
        System.out.println("Changing to lower Case " +word1.toLowerCase());//corejava
  
        // Converting cases
        String word2 = "Simpleprogram";
        System.out.println("Changing to UPPER Case " + word2.toUpperCase());//COREJAVA
  
        
        // Trimming the word
        String word4 = "  I will be try  ";
        System.out.println("Actual String: "+word4);//   I will be try   
        System.out.println("Actaul lenght is: "+word4.length());//17
        System.out.println("After trim String: "+word4.trim());//I will be try
        System.out.println("After trim lenght is:" + word4.trim().length());//13
  
        
     // Replacing characters
        String str1 = "CoreJavaBasic";
        System.out.println("Original String: " + str1);//CoreJavaBasic
        String str2 = str1.replace('a' ,'x') ;
        System.out.println("Replaced a with x -> " + str2);//CoreJxvxBxsic
       
        String str3=str1.replace("Java", "Net");
        System.out.println("Replaced 'Java' with 'Net' -> " + str3);//CoreNetBasic
        
        String str4=str1.replaceFirst("a", "W");
        System.out.println("Replaced first 'a' with 'W' -> " + str4);//CoreJWvaBasic
        String str5=" ";
        System.out.println("str5 is empty or not: "+str5.isEmpty());
        
        String str6=new String();
        System.out.println("str6 is empty or not: "+str6.isEmpty());
        
    } 

	}


