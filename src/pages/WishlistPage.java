package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPage {
	WebDriver driver;

	public WishlistPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void wishlistInput(String wishlist)
	{
		driver.findElement(By.id("name")).sendKeys(wishlist);
	}
	
	public void wishlistsave()
	{
		driver.findElement(By.id("submitWishlist")).click();
	}
	public List<WebElement> wishlist()
	{
		return driver.findElements(By.tagName("tr"));
	}
	public List<String> listOfWishlists()
	{
		List <String >list=new ArrayList<>();
		for(WebElement item:wishlist())
		{
			list.add(item.getText());
		}
		return list;
		
	}
	public boolean searchedItem(String item)
	{
		boolean lookfor=false;
	for(String i:listOfWishlists())
	{
		if(i.trim().contains(item))
			System.out.println(i);
				 lookfor=true;
		
	}
	
		return lookfor;
		
	}
	
}
