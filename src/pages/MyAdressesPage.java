package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAdressesPage {
	WebDriver driver;

	public MyAdressesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void updateButtonClick()
	{
		driver.findElement(By.cssSelector("a[title='Update'")).click();
	}
	public void deleteButtonClick()
	{
		driver.findElement(By.cssSelector("a[title='Delete'")).click();
	}
	public void addAddresButtonClick()
	{
		driver.findElement(By.cssSelector("a[title='Add an address'")).click();
	}
	public void newAddress(String address)
	{
		driver.findElement(By.id("address1")).sendKeys(address);
	}
	public void saveButtonClick()
	{
		driver.findElement(By.id("submitAddress")).click();
	}
	public WebElement address()
	{
		return driver.findElement(By.id("address1"));
	}
	public String addressText()
	{
		return driver.findElement(By.className("address_address1")).getText();
	}
	public void firstname(String firstname)
	{
		driver.findElement(By.id("firstname")).sendKeys(firstname);
	}
	public void firstnameClear()
	{
		driver.findElement(By.id("firstname")).clear();;
	}
	public void lastname(String lastname)
	{
		driver.findElement(By.id("lastname")).sendKeys(lastname);
	}
	public void lastnameClear()
	{
		driver.findElement(By.id("lastname")).clear();
	}
	public void city(String city)
	{
		driver.findElement(By.id("city")).sendKeys(city);
	}
	public void postcode(String postcode)
	{
		driver.findElement(By.id("postcode")).sendKeys(postcode);
	}
	public void phone(String phone)
	{
		driver.findElement(By.id("phone")).sendKeys(phone);
	}
	public void state(String statename)
	{
		Select state=new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText(statename);
		
		
	}
	public void country(String countryName)
	{
		Select country=new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText(countryName);
		
	}
	public void phone_mobile(String phone_mobile)
	{
		driver.findElement(By.id("phone_mobile")).sendKeys(phone_mobile);
	}


}
