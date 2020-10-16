package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17_Operator {
	
	public static void main(String[] args) throws IOException {
		
		
		//¿¬»êÀÚ
		//1. »ê¼ú ¿¬»êÀÚ 
		// - +, -, *, /, %
		// - ¿¬»êÀÇ °á°ú´Â µÎ ÇÇ¿¬»êÀÚ Áß ´õ Å« ÀÚ·áÇüÀ¸·Î ¹İÈ¯µÈ´Ù (*****)
		// - À§ÀÇ »óÈ²À» ÄÁÆ®·Ñ ÇÏÁö ¸øÇÏ¸é -> ¿À¹öÇÃ·Î¿ì°¡( ¾ğ´õÇÃ·Î¿ì)°¡ ¹ß»ıÇÑ´Ù.
		
		
		//2. ºñ±³ ¿¬»êÀÚ 
		// - >, >=, <, <=, ==, !=
		// - 2Ç× ¿¬»êÀÚ 
		// - ÇÇ¿¬»êÀÚµéÀÇ ºñ±³ ¿ìÀ§¸¦ ¹İÈ¯ÇÏ´Â ¿ªÇÒ 
		// - ÇÇ¿¬»êÀÚ´Â ¼ıÀÚ¸¦ °¡Áø´Ù.
		// - ¿¬»êÀº °á°ú¸¦ Ç×»ó booleanÀ¸·Î ¹İÈ¯ÇÑ´Ù.
		
		int a = 10;
		int b = 3;
		
		System.out.println(a > b); //t
		System.out.println(a >= b);//t
		System.out.println(a < b);//f
		System.out.println(a <= b);//f
		System.out.println(a == b);//f
		System.out.println(a != b);//t
		
		//³ªÀÌ ÀÔ·Â 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("³ªÀÌ: ");
		
		//String data =br.readLine();
		
		//System.out.println("È«±æµ¿" > "¾Æ¹«°³"); (X)
		
		//int age = Integer.parseInt(data);
		
		//System.out.println(age >= 19); // ÁÁÀº ÄÚµå 
		//System.out.println( 19 <= age); //³ª»Û ÄÚµå (µÇµµ·Ï »ç¿ëÇÏÁö ¸» °Í)
		
		//-----------------------------------------------------------------------
		
		//À¯È¿¼º °Ë»ç, validation Check
		// -(»ç¿ëÀÚ ÀÔ·Â) µ¥ÀÌÅÍ°¡ ÇÁ·Î±×·¥»ó¿¡¼­ ¾µ¸ğ°¡ ÀÖ´Â °ªÀÎÁö ¾Æ´ÑÁö¸¦ ÆÇ´ÜÇÏ´Â ÀÛ¾÷
		
		// »ç¿ëÀÚ ÀÔ·Â ¹®ÀÚ -> ¼Ò¹®ÀÚ ÀÔ·Â È®ÀÎ
		
		//ÂüÁ¶Çü <-> °ªÇü(X)
		//String <-> int
		//System.out.println((int)data);
		
		
		System.out.print("¹®ÀÚ: ");
		
		int code = br.read();
		System.out.println(code);
		
		System.out.println(code >= 97);
		System.out.println(code <= 122);
	    
	    System.out.println(code >= (int)'a');
	    System.out.println(code <= (int)'z');
	    
	    System.out.println(code >= 'a');
	    System.out.println(code <= 'z');
	    
	    System.out.println('a'>'b');
	    
	    System.out.println("ÇÑ±Û °Ë»ç");
	    System.out.println(code >= '°¡');
	    System.out.println(code <= 'ÆR');
	    
	    System.out.println("¼ıÀÚ °Ë»ç");
	    System.out.println(code >= '0');
	    System.out.println(code <= '9');
	    
	    //******************
	    System.out.println('È«'>'±è');//O - ºñ±³ ¿¬»êÀÚ¿¡¼­ char´Â ¼ıÀÚÃë±Ş ÇÑ´Ù-> °ªÇü³¢¸®´Â ºñ±³ ¿¬»êÀÌ °¡´É
	   // System.out.println("È«">"±è");//X - ÂüÁ¶Çü ³¢¸®´Â ºñ±³¿¬»êÀÌ ºÒ°¡´É
		
	    
	    
		
		
		
		
		
		
	}

}
