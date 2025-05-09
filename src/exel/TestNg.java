package exel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	
	@BeforeTest
	public void a() {
		
		System.out.println("hi i am beformethod");
		
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
