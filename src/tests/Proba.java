package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Proba {
@Test
public void test() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://google.com");
	Thread.sleep(3000);
	driver.quit();
}

}
