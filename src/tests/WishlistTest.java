package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class WishlistTest extends MyAccountTest{
	@Test
	public void addWishlst() throws InterruptedException
	{
		myAccountPage.myWishListsClick();
		wishlist.wishlistInput("mirko");
		wishlist.wishlistsave();
		wishlist.wishlistInput("branko");
		wishlist.wishlistsave();
		
		assertTrue(wishlist.searchedItem("mirko"));
		assertTrue(wishlist.searchedItem("branko"));
		Thread.sleep(3000);
		
		
		
	}
	

}
