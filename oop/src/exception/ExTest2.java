package exception;

import java.io.IOException;

public class ExTest2 {

	public static void main(String[] args) throws IOException { 
		// ���α��� ���ܸ� ������ ���ܰ� ��������� �̷��� ���ܸ� ���� �ʴ� ���α׷��� �ȴ�.
		// ��𼱰����� ���� ó���� �ؾ��Ѵ�.
		
		
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
//			e.printStackTrace();// Ư���� �ذ��� ������ �ƴϿ��� �̰� �־���� ���� ������ ������
//		}
		 
		 
		 
		 
		 System.out.println((char) ch);
	}

}
