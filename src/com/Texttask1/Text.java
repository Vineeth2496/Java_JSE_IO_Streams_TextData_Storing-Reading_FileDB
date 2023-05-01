package com.Texttask1;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		BufferedInputStream bi=new BufferedInputStream(System.in);
		FileOutputStream fo=new FileOutputStream("Text.txt",true);
		System.out.println("Please Enter data till #");
		for(int i; (i=bi.read())!='#';)
			{
			fo.write(i);			
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
