package exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest5 
{

	public static void main(String[] args) // ���⿡ throw ���� ȣ���� ������ ����ó���� ����
	{
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
			while(true) 
			{
				System.out.print("�������� �Է�");
				try 
				{
					score = sc.nextInt(); // ���ڰ� �ƴ� �� �Է��ϰų�
					
					if (score < 0 || score > 100) // ���� �̻��ϰ� �Է��ϰų�
					{
//						System.out.println("�߸� �Է��߽��ϴ�");
//						continue;
						throw new ScoreException(); // �ؿ� catch�� ������ ��.
					}
				}
				catch(InputMismatchException e) 
				{
					System.out.println("���ڷ� �Է��ϼ���");
					sc.nextLine(); // ���� ���� �����Է� ��
					continue; // �߸��Է������� �ٽ� �Է��ϰ� ����
				}
				catch (ScoreException e) // Ŭ������ �����ؼ� ��ü���� �� 
				{
					e.printStackTrace();
					continue;
				}
				break; // Ż��
			}
		
		System.out.println(score);
	}
}
