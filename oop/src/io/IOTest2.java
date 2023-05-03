package io;

import java.io.FileWriter;
import java.io.IOException;

// 텍스트 파일 출력
public class IOTest2 
{

	public static void main(String[] args) 
	{
		FileWriter out = null;
		
		//1.스트림 생성 
		try 
		{
			out = new FileWriter("b.txt");	   	// 같은 이름의 파일이 있으면 붙여넣기 되니까 항상 확인하는 메서드를 먼저 쓸 것.
		} 										// FileWriter 써야 쓰기 가능
		catch (IOException e)  
		{
			System.out.println("파일 생성 실패");
			return;
		}
		
		//2.입출력 작업
		try 
		{
			out.write('A'); // 문자를 출력 1바이트
			out.write('가'); 			 	//2바이트
			out.write('\n'); 
		} 
		catch (IOException e) 
		{
			System.out.println("쓰기 작업 중 오류");
		}
		
		//3.스트림 닫기 마지막에는 데이터를 항상 밀어내야 한다.
		try 
		{
			out.close(); // 보내는 메서드 // 닫지 않으면 데이터가 손실될 수 있다.
		} 
		catch (IOException e) 
		{
			System.out.println("파일 닫기 오류");
		}
	}
}
