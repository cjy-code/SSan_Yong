package com.test.java;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//*(wildcard) - ¸ğµç Å¬·¡½º -> all
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_Bufferedreader {
	
	public static void main(String[] args) throws IOException {
		
		//Ex12_BufferedReader.java
		
		//¹®ÀÚ 1°³ ÀÔ·Â -> Ãâ·Â
		
		System.out.print("¹®ÀÚ: ");
		
		//System.in.read() °°Àº ¿ªÇÒ ÄÚµå
		//Cntl + Shift + 0 : ÆĞÅ°Áö(Å¬·¡½º) Import ´ÜÃàÅ°
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//System.in.read(); ¸Ş¼­µå
		//reader.read(); ¸Ş¼­µå
		//reader.readLine(); ¸Ş¼­µå
		
		
		//A(65) ~ Z(90)
		//a(97) ~ z(122)
		//0(48) ~ 9(47)
		//°¡(44032) ~ÆR(55203)
		//¤¡ ~ ¤¾
		//¤¿ ~ ¤Ó

        //int data = reader.read();
        //System.out.printf("%c\n",data);
		
		//readLine(): »ç¿ëÀÚ ÀÔ·ÂÇÑ ¹®ÀåÀ» °¡Á®¿Â´Ù.(ÇÑ ¶óÀÎÀ» ÅëÂ°·Î °¡Á®¿Â´Ù.)
	    //String data = reader.readLine();
	    //System.out.println(data);
		
		//¿ä±¸»çÇ×] »ç¿ëÀÚ¿¡°Ô ÀÌ¸§À» ÀÔ·Â¹Ş¾Æ -> ÀÎ»ñ¸»À» Ãâ·ÂÇÏ½Ã¿À.
		System.out.print("ÀÌ¸§ ÀÔ·Â: ");
		
		String name = reader.readLine();
		
		System.out.printf("%s´Ô ¹İ°©½À´Ï´Ù.\n", name);
		
		
		
		
	}

}
