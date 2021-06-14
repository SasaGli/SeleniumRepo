package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInfoPage {
	WebDriver driver;

	public PersonalInfoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void radioButonClick(String gender)
	{
		if(gender.equals("Mr"))
{
	driver.findElement(By.id("id_gender1")).click();
}else
	driver.findElement(By.id("id_gender2")).click();
	}
	public WebElement username() {
		return driver.findElement(By.id("firstname"));
	}
	public void enterUsername(String username)
	{
		username().sendKeys(username);
	}
	public WebElement lastname() {
		return driver.findElement(By.id("lastname"));
	}
	public void enterlastname(String lastname)
	{
		lastname().sendKeys(lastname);
	}
	public WebElement email() {
		return driver.findElement(By.id("email"));
	}
	public void enteremail(String email)
	{
		email().sendKeys(email);
	}
	public WebElement password() {
		return driver.findElement(By.id("old_passwd"));
	}
	public void enterpassword(String password)
	{
		password().sendKeys(password);
	}
	public void saveButonClick() {
		driver.findElement(By.cssSelector("button[name='submitIdentity']")).click();
	}
	public String confirmationMessage()
	{
		return driver.findElement(By.cssSelector(".alert.alert-success")).getText();
	}
	
	
	

}
