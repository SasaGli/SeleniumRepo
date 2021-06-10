package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationPage {
	
	WebDriver driver;
	

	public NavigationPage(WebDriver driver) {
		super();
		this.driver = driver;
		
	}
	public void goToSigninPage()
	{
		driver.findElement(By.linkText("Sign in")).click();
	}

}
