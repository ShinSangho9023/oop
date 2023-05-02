package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOTest4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String file = null;
		FileReader in = null;
		int ch1;
		
		while (true) 
		{
			System.out.print("읽을 파일 : ");
			file = sc.next();
			String ch = "\"";
			file = file.replaceAll(ch, "");
			System.out.println(file);
			
			File a = new File(file);
			
			if (a.exists() == false) 
			{
				System.out.println("파일 없습니다. 다시 입력하세요");
				continue;
			}
			else break;
		}
		
		File b = new File(file);
		
		System.out.println();
		System.out.println("-------------- 읽은 내용 출력");
		System.out.println();
		
		try 
		{
			in = new FileReader(file);
		} 
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다");
			return;
		}
		
		//------------------------------------
		
		try 
		{					
			while((ch1 = in.read()) != -1)	
			System.out.print((char)ch1); 
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//-------------------------------------
		
		try 
		{
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("총 " + b.length() + "bytes");
		
	} //main
} //class

//읽을 파일 : c:\aaa.txt
//파일 없습니다. 다시 입력하세요.
//읽을 파일 : c:\Test\aaa.txt
// 
//------------ 읽은 내용 출력
//
//총 xxx bytes (총 몇 바이트인지 출력)

//
//파일 클래스 왜 쓰는지
//텍스트 파일을 읽는 클래스