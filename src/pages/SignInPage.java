package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void emailInputField(String email)
	{
		driver.findElement(By.id("email")).sendKeys(email);
	}
	public void passwordInputField(String password)
	{
		driver.findElement(By.id("passwd")).sendKeys(password);
	}
	public void signInButtonClick()
	{
		driver.findElement(By.id("SubmitLogin")).click();
	}
	public String profileName()
	{
		return driver.findElement(By.cssSelector("a[title='View my customer account']")).getText();
	}
	public WebElement profileNameElement()
	{
		return driver.findElement(By.cssSelector("a[title='View my customer account']"));
	}
	public String errorMessage()
	{
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
	}
	

}
