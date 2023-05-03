package io;

import java.io.Serializable;

// ���赵��.
public class Data implements Serializable //�ʿ��� �������� �ټ����� ��Ʈ������ ���� �� �ְԲ� ���ش�. 
										//���������̰ų� ���ͳ����� ������ �ϴ� �ڷ�� �̷��� ����ȭ �����
{ 										//Serializable�� ��ӹ��� ������ ���� �ȵȴ�.
	/**
	 * 
	 */
	private static final long serialVersionUID = -7750532192394107844L;
	// ����ȭ�Ҷ� �� ���ڰ� ������ ���� ������ �� ģ��. ����Ȯ��
	
	
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
