package exception;

import java.io.IOException;

public class ExTest2 {

	public static void main(String[] args) throws IOException { 
		// 메인까지 예외를 던지면 예외가 사라지지만 이러면 예외를 하지 않는 프로그램이 된다.
		// 어디선가에선 예외 처리를 해야한다.
		
		
		input();
		
		
		
	}

	 static void input() throws IOException 
	 {
		 
		 int ch = 0;
		 
		 ch = System.in.read();
		 
//		 try 
//		{
//			ch = System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();// 특별히 해결할 문제가 아니여도 이걸 넣어줘야 오류 추적이 가능함
//		}
		 
		 
		 
		 
		 System.out.println((char) ch);
	}

}
