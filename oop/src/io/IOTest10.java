package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest10 
{

	public static void main(String[] args) throws Exception 
	{
		Data ar;
		ObjectInputStream in;
		
		in = new ObjectInputStream(new FileInputStream("ob.data"));
		
		
			try
			{
				while (true)
				{
				ar = (Data) in.readObject(); // object 상위타입이라서 형변환을 사용해 읽어와야 한다. //객체 하나씩 꺼내온다.
				System.out.println(ar);
				}
				
			}
			catch(EOFException e) {} // while 문을 빠져나오는 통로
			
		
		// 설계도가 없으면 못읽는다.
		// 저장했을 때, 불러올때 수정되었을 수도 있다.
		// 같은 파일
//		파일 스트림 1바이트
//		버퍼스트림 	한 줄씩
//		오브젝트 스트림 어떤 자료형으로 저장할 때
			
		in.close();
	}
}
