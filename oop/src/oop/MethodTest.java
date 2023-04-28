package oop;

public class MethodTest 
{

	public static void main(String[] args) 
	{
		Data d1 = new Data();
		Data d2 = new Data(10, 20);
		
		int i = new Data().sum(); 
		
		
		System.out.println(d1);
		System.out.println(d2);
		
		d2.print();
		System.out.println(d2.sum()); //30
		System.out.println(d1.sum()); //0
		System.out.println(Data.sum(5, 10)); //30// 그때마다 값을 받는 계산기 역활 
		// static 메서드를 활용해 객체 선언을 안해도 함수 호출 가능
		
		System.out.println(Data.power(2,4) + "제곱");
		
		
		System.out.println(Data.sum(1, 10, 2));
		
	}	// 공유 데이터는 static으로 각자하는 건 맴버 변수로 
	
}
