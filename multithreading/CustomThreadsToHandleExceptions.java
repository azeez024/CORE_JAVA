Create a Java application where we have to create three custom defined threads by using Runnable interface using Arrow Tokens, 
in 1st thread we have to raise and handle ArrayIndexOutOfBoundsException, in 2nd thread we have to raise and handle Number 
format exception and in 3rd thread we have to raise and handle NullpointerException.

Note: If we give valid input then it has to display valid output and if it is invalid input then it will raise the exception and we have to handle it.

import java.util.*;
class A{
	static Scanner sc = new Scanner(System.in);
	int a = 10;
	void m1(A obj){
		System.out.println("m1");
		try{
			ArrayList<String> al = new ArrayList(10);
			al.add("hello");
			al.add(null);
			System.out.println(al.get(sc.nextInt()).length());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	void m2(){
		int a[] = {10,20,30};
		try{
			System.out.println(a[sc.nextInt()]);
		}
		catch(Exception e){
			System.out.println("Exception raised");
		}
	}
	void m3(){
		try{
			int b = Integer.parseInt(sc.next());
		}
		catch(Exception e){
			System.out.println("Exception raised");
		}
		
	}
}
class Test{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)throws Exception{
		Thread t1 = new Thread(()->{
			A obj = new A();
			obj.m1(null);
		});
		t1.start();
		t1.join();
		Thread t2 = new Thread(()->{
			A obj = new A();
			obj.m2();
		});
		t2.start();
		t2.join();
		Thread t3 = new Thread(()->{
			A obj = new A();
			obj.m3();
		});
		t3.start();
		t3.join();
	}
}
