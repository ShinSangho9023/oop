package exception;

public class ExTest1 
{

	public static void main(String[] args) 
	{
		String ar[] = {"10","a"};
		int a,b,c;
		// � ���ܸ� ��ó�ϱ� ���� try catch�� ����Ѵ�.
		try {
			a = Integer.parseInt(ar[0]);
			b = Integer.parseInt(ar[1]);
			c = a / b;
			System.out.println(c);
			}
		
		catch (NumberFormatException abc) // ���� �۵��� �ϸ� catch�� ���� �Ͱ� ����. //abc�� ��� ���̳� �������. 
		{
				System.out.println("���ڰ� �ƴ�");
				// ���⿡ return�� �͵� finally�� ���ļ� ���� �ȴ�.
		}
		catch (ArithmeticException e)
		{
			System.out.println("0���� ���� �� �����ϴ�");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("�迭�� index�� ������ �Ѿ");
		}
		finally // �� ���� ���� ����ǵ� ������ ����ȴ�. �������� ó���ؾ� �ϴ� ����.
		{
			System.out.println("�������� ������");
		}
			
		//��Ӱ���� ���� Ŭ������ �տ� �;��Ѵ�.
			
			System.out.println("���α׷��� ��");
	
	}
}
