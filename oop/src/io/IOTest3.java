package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 텍스트 파일 읽기
public class IOTest3 
{

	public static void main(String[] args) 
	{
		FileReader in = null;
		int ch;
		try // 문서 열기 // 이건 우리가 열기 클릭한 것과 동일한 수행이다.
		{
			in = new FileReader("C:\\Users\\user\\git\\km_44\\km_44\\src\\shcool\\Student.java");
		} 
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다");
			return;
		}
		
		//------------------------------------
		
		try // 문자 읽기
		{					//read() 메서드가 int형이다. 그래서 변수 자료형도 int로 썼다.
			while((ch = in.read()) != -1)	// 파일에서 1문자 읽기. 형변환 안하고 출력하면 문자번호로 보이게 된다. 다 읽고 읽을게 없으면 -1을 리턴한다.
			System.out.print((char)ch); // 읽은 문자 출력
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//-------------------------------------
		
		try // 문서 닫기
		{
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
