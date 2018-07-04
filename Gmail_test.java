package Gmail.Gmail.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_test {
	WebDriver driver;
	Gmail_function obj = new Gmail_function(driver);

	@BeforeTest
	public void Before() {
		obj.launch();

	}

	@Test
	public void Test1() throws InterruptedException {
		obj.loginWithValid();

	}
	@Test
	public void Test2() throws InterruptedException {
		obj.mail();
		
		
	}
	 @AfterTest
	 public void After() throws InterruptedException {
	
	 obj.close();
	
	 }
}
