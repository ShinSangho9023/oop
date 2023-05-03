package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest8 {

	public static void main(String[] args) throws Exception {

		//파일의 구조를 알아야 하고 객체 타입을 쓸 수 있어야 한다. 
		
		ArrayList<String> ar;
		ObjectInputStream in;
		
		in = new ObjectInputStream(new FileInputStream("ob.data"));
		ar = (ArrayList<String>) in.readObject(); // object 상위타입이라서 형변환을 사용해 읽어와야 한다.
		
		
		System.out.println(ar);
		
		
		// 모든 종류의 객체를 이렇게 저장, 꺼내쓸 수 있다.
		// 학생부 같은 것도 이렇게 응용가능
		// 저장했다가 복원해서 사용
		
		
	}

}
