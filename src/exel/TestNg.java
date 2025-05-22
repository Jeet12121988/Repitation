package exel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	
	@BeforeClass
	public void a() {
		
		System.out.println("hi i am beforeclass");
		
	}
	
	@BeforeTest
	public void ab() {
		
		System.out.println("hi i am beforeTest");
		
	}
	
	@BeforeMethod
	public void abc() {
		
		System.out.println("hi i am beforeMethod");
		
	}

	
	@Test
public void b() {
		
		System.out.println("hi i am method b");
		
	}

	@Test
public void c() {
	
	System.out.println("hi i am beformethod c");
	
}

}
