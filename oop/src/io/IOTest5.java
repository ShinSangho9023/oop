package io;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 텍스트 파일 읽기 - 한줄씩 읽기
public class IOTest5 
{
	public static void main(String[] args) 
	{
		FileReader in = null;
		BufferedReader br = null; // 이것만으로는 입력 못한다. 
		int ch;
		
		try // 문서 열기 // 이건 우리가 열기 클릭한 것과 동일한 수행이다.
		{
			//in = (new FileReader("C:\\Users\\user\\git\\km_44\\km_44\\src\\shcool\\Student.java"); // FileReader로 열어준다. 하나씩 읽어오는 스트림 객체
			br = new BufferedReader((new FileReader("C:\\Users\\user\\git\\km_44\\km_44\\src\\shcool\\Student.java"))); // 한줄씩 읽어오는 기능 추가 *변수는 스트링타입
						//2단계												//1단계
			//BufferedReader는 스트링을 모아서 처리할 수 있는 기능을 제공한다.
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("파일이 없습니다");
			return;
		}
		try 
		{
			while(true) 
			{
				String s = br.readLine(); 	// 한줄을 읽어오는 행
				if (s == null) 				// null이 나올때까지 반복하다가 종료
				{
					break;
				}
				System.out.println(s); 		// 읽어온 행을 출력
			}
			
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
		try 
		{
			br.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} //이런 버퍼들은 반드시 닫아야한다. 모아놓고 있으니까 
		
		
		
		
	}// main
	
}// class

/**
 * new bufferedTeader(new InputStreamTeader (System.In) 
 * 바이트 단위를 **/
