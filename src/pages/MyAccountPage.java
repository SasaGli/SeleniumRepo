package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	public String cmyAccountOptionsText()
	{
		return driver.findElement(By.cssSelector(".page-heading.bottom-indent")).getText();
	}
	public void myAddressesClick()
	{
		driver.findElement(By.cssSelector("a[title='Addresses']")).click();
	}

	public void myPersonalInformationsClick()
	{
		driver.findElement(By.cssSelector("a[title='Informations']")).click();
	}
	public void myWishListsClick()
	{
		driver.findElement(By.cssSelector("a[title='My wishlists']")).click();
	}
	

}
