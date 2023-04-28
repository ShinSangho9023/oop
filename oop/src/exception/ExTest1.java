package exception;

public class ExTest1 
{

	public static void main(String[] args) 
	{
		String ar[] = {"10","a"};
		int a,b,c;
		// 어떤 예외를 대처하기 위해 try catch를 사용한다.
		try {
			a = Integer.parseInt(ar[0]);
			b = Integer.parseInt(ar[1]);
			c = a / b;
			System.out.println(c);
			}
		
		catch (NumberFormatException abc) // 정작 작동을 하면 catch는 없는 것과 같다. //abc는 어느 것이나 상관없다. 
		{
				System.out.println("숫자가 아님");
				// 여기에 return이 와도 finally를 거쳐서 리턴 된다.
		}
		catch (ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("배열의 index가 범위를 넘어감");
		}
		finally // 이 행은 정상 실행되도 무조건 실행된다. 마지막에 처리해야 하는 예외.
		{
			System.out.println("마지막에 무조건");
		}
			
		//상속관계면 하위 클래스가 앞에 와야한다.
			
			System.out.println("프로그램의 끝");
	
	}
}
