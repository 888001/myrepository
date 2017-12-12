package cn.hpp.hadoop;

public class Test {
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.setA(10);
		insert(t);
		System.out.println(t.getA());
	}
	public static void insert(Test t){
		t.setA(25);
	}
}
