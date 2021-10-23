package com.tcs.encode;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class App {

	public static void main(String[] args) {
		
		String name = "Syed Tahauddin";
		byte[] bname = name.getBytes();
		
		Encoder encoder = Base64.getEncoder();
		String encode = encoder.encode(bname).toString();
	
		System.out.println(encode);
		
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encode);
		
		String decodedName = new String(decode);
		
		String originalName = decode.toString();
		System.out.println(decodedName);
		
		
	}

}
