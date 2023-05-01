package com.Texttask1;

import java.io.FileInputStream;

public class TextFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileInputStream fi=new FileInputStream("Text.txt");
		for(int i; (i=fi.read())!=-1;)
		{
			System.out.print((char)i);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
