package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class WishlistTest extends MyAccountTest{
	@Test(priority=0)
	public void addWishlst() throws InterruptedException
	{
		myAccountPage.myWishListsClick();
		wishlist.wishlistInput(excelReader.getStringData("TC12", 7, 2));
		wishlist.wishlistsave();
		
		
		assertTrue(wishlist.searchedItem(excelReader.getStringData("TC12", 10, 2)));
		
		Thread.sleep(3000);
	
		
	}
	@Test(priority=10)
	public void addMultileWishlists() throws InterruptedException
	{
		myAccountPage.myWishListsClick();
		wishlist.wishlistInput(excelReader.getStringData("TC12", 7, 2));
		wishlist.wishlistsave();
		wishlist.wishlistInput(excelReader.getStringData("TC13", 4, 2));
		wishlist.wishlistsave();
		
		
		assertTrue(wishlist.searchedItem(excelReader.getStringData("TC12", 7, 2)));
		
		Thread.sleep(3000);
	}
	@Test(priority=15)
	public void deleteWishlist() throws InterruptedException {
		myAccountPage.myWishListsClick();
		int numberOfListElements=wishlist.listOfWishlists().size();
		wishlist.removeItem();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		assertTrue(numberOfListElements>wishlist.listOfWishlists().size());
		Thread.sleep(3000);
	}
	

}
