package tests;

import org.testng.annotations.Test;

public class TestClass1 {

	
	@Test
	public  void test1()
	{
		System.out.println("Test Class 1 - Test1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public  void test2()
	{
		System.out.println("Test Class 1 -Test2");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public  void test3()
	{
		System.out.println("Test Class 1 -Test3");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
