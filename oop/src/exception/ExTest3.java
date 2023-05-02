package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		
		// 키보드로 정수 5개를 입력받아 배열 num에 저장
		
		for (int i = 0; i < num.length; i++)
		{
			try 
			{
				num[i] = sc.nextInt();
			} 
			
			catch (InputMismatchException e) // 무슨 예외인지 모를 떈 일부러 예외를 내보고 보고 써도 됨.
			{  								// 혹은 상위 타입의 예외처리로 모든 걸 다 받아도 됨.
				// 버퍼를 비우고 i번째를 다시
				System.out.println("숫자를 제대로 입력하세요");
				sc.nextLine();//한 줄을 한꺼번에 읽기 때문에 전부 읽어가서 버퍼가 비어짐
				i--; 
			}
		}
		
		for (int j = 0; j < num.length; j++) 
		{
			System.out.print(num[j] + " ");
		}
		
		
		// 배열에 저장된 값 5개를 출력
		
		
		
		
	}
}
//1
//2
//a 
//3
//b
//4
//5 
//
//1 2 3 4 5 
//
//이중 포문을 사용해서 
//
//다른 값이 들어 와도 무시하고 try catch를 이용해서 다시 입력 받겠금. 숫자만 다섯개 받겠금