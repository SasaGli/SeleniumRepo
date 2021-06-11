package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void ordersHistoryAndDetailsClick()
	{
		driver.findElement(By.cssSelector("a[title='Orders']")).click();
	}

	
	public void myCreditSlipsClick()
	{
		driver.findElement(By.cssSelector("a[title='Credit slips']")).click();
	}
	public String myAccountOptionsText()
	{
		return driver.findElement(By.cssSelector(".page-heading.bottom-indent")).getText();
	}
	public String personalInformationsText()
	{
		return driver.findElement(By.cssSelector(".page-subheading")).getText();
	}
	public String myAddressesorWishlistText()
	{
		return driver.findElement(By.cssSelector(".page-heading")).getText();
	}
	public void myAddressesClick()
	{
		driver.findElement(By.cssSelector("a[title='Addresses']")).click();
	}

	public void myPersonalInformationsClick()
	{
		driver.findElement(By.cssSelector("a[title='Information']")).click();
	}
	public void myWishListsClick()
	{
		driver.findElement(By.cssSelector("a[title='My wishlists']")).click();
	}
	public List<WebElement> profileExists()
	{
		return driver.findElements(By.cssSelector("a[title='View my customer account']"));
	}
	

}
