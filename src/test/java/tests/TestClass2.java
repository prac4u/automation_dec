package tests;

import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public  void test1()
	{
		System.out.println("Test Class 2 -Test1");
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
		System.out.println("Test Class 2 -Test2");
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
		System.out.println("Test Class 2 -Test3");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
