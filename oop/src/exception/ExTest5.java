package exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest5 
{

	public static void main(String[] args) // 여기에 throw 쓰면 호출한 곳으로 예외처리를 보냄
	{
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
			while(true) 
			{
				System.out.print("국어점수 입력");
				try 
				{
					score = sc.nextInt(); // 숫자가 아닌 걸 입력하거나
					
					if (score < 0 || score > 100) // 값을 이상하게 입력하거나
					{
//						System.out.println("잘못 입력했습니다");
//						continue;
						throw new ScoreException(); // 밑에 catch로 보내는 행.
					}
				}
				catch(InputMismatchException e) 
				{
					System.out.println("숫자로 입력하세요");
					sc.nextLine(); // 버퍼 비우기 문자입력 시
					continue; // 잘못입력했으니 다시 입력하게 만듬
				}
				catch (ScoreException e) // 클래스로 정의해서 객체생성 후 
				{
					e.printStackTrace();
					continue;
				}
				break; // 탈출
			}
		
		System.out.println(score);
	}
}
