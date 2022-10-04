package day06.innerclass;
/*
 *  [[ 내부 클래스 (innerclass) ]]
 *  
 *  클래스 안에 또다른 클래스 정의
 * 
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		new InnerClass().doSomething();
	}
	
	static class InnerClass {
		public void doSomething() {
			System.out.println("무언가를 해요");
		}
	}
	
}
