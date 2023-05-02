package io;

import java.io.File;
import java.io.IOException;

public class IOTtest1 {

	public static void main(String[] args) {
		
		File a = new File("a.txt");
		File b = new File("sub");
		
		System.out.println(a);
		System.out.println(a.exists()); 	 // 존재하는 가
		System.out.println(a.isFile()); 	 // 파일로 존재하는지
		System.out.println(a.isDirectory()); // 디렉토리로 존재하는지
		
		try 
		{
			a.createNewFile();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		// 아무것도 없는 채로 파일이 만들어짐
		// 지우는 것도 a. 함수 호출로 지울 수 있음
		
		b.mkdir();
		
		System.out.println(a.exists()); 	 // 존재하는 가
		System.out.println(a.isFile()); 	 // 파일로 존재하는지
		System.out.println(a.isDirectory()); // 디렉토리로 존재하는지
		
		File c = new File("C:\\java\\school\\src\\school\\vo\\Student.java");
		System.out.println(c.isFile());
		System.out.println(c.getName()); 	// 파일이름 출력
		System.out.println(c.getParent()); 	// 파일 위치
		System.out.println(c.length()); 	// byte 단위의 용량, 크기
		
		File d = new File("C:\\java\\school\\src\\school\\vo");
		String filenames[] = d.list(); 	// 폴더 안의 파일이름들을 가져온다.
		File files[] = d.listFiles(); 	// 폴더 안에 파일 경로들을 가져온다.
		
		for (int i = 0; i < filenames.length; i++) // 이름가져오기
		{
			System.out.println(filenames[i]);
		}
		
		for (int i = 0; i < files.length; i++) //경로 가져오기
		{
			System.out.println(files[i]);
		}
		
		// 현재 위치 알아내기
		File e = new File ("."); // 상대경로 현재 경로에
		try 
		{
			System.out.println(e.getCanonicalPath());// 예외처리 해야 쓸 수 있다. 절대경로 구하는 메서드
		} catch (IOException e1) 
		{
			e1.printStackTrace();
		} 
		
		
		// 파일명 변경하기
		File f = new File("a2.txt"); // a 객체의 참조값은 그대로지만 실제 파일을 이름이 변경되었다.
		a.renameTo(f); // f의 파일은 존재하지 않으니 정보만 붙여넣기 됨. 
		System.out.println(a);
		
		// 파일 삭제하기
		a.delete();
		
 	}
}
