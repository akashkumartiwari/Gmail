package Gmail.Gmail.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_function {
	WebDriver driver;

	public Gmail_function(WebDriver driver) {
		this.driver = driver;
	}

	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\uditsharma\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
	}

	public void loginWithValid() throws InterruptedException {
		driver.findElement(By.cssSelector("a[class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
		driver.findElement(By.cssSelector("input[class='whsOnd zHQkBf']")).sendKeys("rstu14");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[class='whsOnd zHQkBf']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	}

	public void mail() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@id=':o8']")).sendKeys("rstu14@gmail.com");
		driver.findElement(By.xpath("//input[@id=':nq']")).sendKeys("HI");
		driver.findElement(By.xpath("//div[@id=':ov']")).sendKeys("Hello");
		driver.findElement(By.xpath("//div[@id=':ng']")).click();

	}
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
