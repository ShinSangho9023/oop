package io;

import java.io.Serializable;

// 설계도임.
public class Data implements Serializable //필요한 정보만을 줄세워서 스트림으로 보낼 수 있게끔 해준다. 
										//파일저장이거나 인터넷으로 보내야 하는 자료는 이렇게 직렬화 해줘야
{ 										//Serializable를 상속받지 않으면 저장 안된다.
	/**
	 * 
	 */
	private static final long serialVersionUID = -7750532192394107844L;
	// 직렬화할때 저 숫자가 같으면 같은 파일인 셈 친다. 버전확인
	
	
	int num;
	double dnum;
	String str;
	public Data(int num, double dnum, String str) {
		super();
		this.num = num;
		this.dnum = dnum;
		this.str = str;
	}
	
	//--------------------------------------------
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	//----------------------------------------------------
	
	@Override
	public String toString() {
		return "Data [num=" + num + ", dnum=" + dnum + ", str=" + str + "]";
	}
	
	
	
	
}
