Create a Java application where we have three interfaces like in 1st interface we have two abstract methods 
and two defined methods then provide functionality by using normal concrete class and invoke the methods by using 
dynamic binding then in 2nd interface we have two abstract and one defined methods then provide functionality
by using Anonymous inner class then invoke the methods and 3rd interface is functional interface with one abstract 
and two defined methods then provide functionality by using Lambda expression then invoke the methods.

import java.util.*;
interface I1{
	static Scanner sc = new Scanner(System.in);
	int m1(float f);
	String m2(long l);
	default void m3(int i){
		System.out.println("m3");
	}
	default long m4(){
		System.out.println("m4");
		return sc.nextLong();
	}
}
interface I2{
	long m5();
	boolean m6(boolean b);
	default void m7(String s){
		System.out.println("m7");
	}
}
interface I3{
	int m8(int a);
	default void m9(){
		System.out.println("m9");
	}
	default void m10(){
		System.out.println("m10");
	}
}

class Concrete implements I1{
	
	static Scanner sc = new Scanner(System.in);
	public int m1(float f){
		System.out.println("m1");
		return sc.nextInt();
	}
	public String m2(long l){
		System.out.println("m2");
		return sc.next();
	}

	
	
	public static void main(String[] args){
		I1 obj1 = new Concrete();
		System.out.println(obj1.m1(sc.nextFloat()));
		System.out.println(obj1.m2(sc.nextLong()));
		obj1.m3(sc.nextInt());
		System.out.println(obj1.m4());
		
		I2 obj2 = new I2(){
			public long m5(){
				System.out.println("m5");
				return sc.nextLong();
			}
			public boolean m6(boolean b){
				System.out.println("m6");
				return sc.nextBoolean();
			}
		};
		System.out.println(obj2.m5());
		System.out.println(obj2.m6(sc.nextBoolean()));
		obj2.m7(sc.next());

		I3 obj3 = (int a)->{
			System.out.println("m8");
			return sc.nextInt();
		};
		System.out.println(obj3.m8(sc.nextInt()));
		obj3.m9();
		obj3.m10();
	}
}
