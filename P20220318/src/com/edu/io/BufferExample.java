package com.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferExample {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream
				("c:/temp/qr.png");//
		BufferedInputStream bis = new BufferedInputStream
				(fis);//
		BufferedOutputStream bos = new BufferedOutputStream
				(new FileOutputStream(("c:/temp/test.png")));) {
			
			int readByte = -1;
			while ((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of program");
	}
}
