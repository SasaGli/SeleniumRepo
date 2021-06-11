package tests;

import static org.testng.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MyAccountTest extends BaseTest{
	
	
	
	
	@BeforeMethod
	public void beforeTests() throws InterruptedException
	{
		driver.navigate().to("http://automationpractice.com/index.php");
		
		if(myAccountPage.profileExists().size()==0)
		logIn();	
		
		navigator.goToMyAccountPage();
	}
	//@Test
	public void historyButton()
	{
		myAccountPage.ordersHistoryAndDetailsClick();
		String assertionText=excelReader.getStringData("TC3", 8, 2);
		assertEquals(myAccountPage.myAccountOptionsText(), assertionText);
	}
	//@Test
	public void wishlistButton()
	{
		myAccountPage.myWishListsClick();
		String assertionText=excelReader.getStringData("TC7", 8, 2);
		assertEquals(myAccountPage.myAddressesorWishlistText(), assertionText);
	}
	//@Test
	public void CreditSlipsButton()
	{
		myAccountPage.myCreditSlipsClick();
		String assertionText=excelReader.getStringData("TC4", 8, 2);
		assertEquals(myAccountPage.myAccountOptionsText(), assertionText);
	}
	//@Test
	public void myAddresesButton()
	{
		myAccountPage.myAddressesClick();
		String assertionText=excelReader.getStringData("TC5", 8, 2);
		assertEquals(myAccountPage.myAddressesorWishlistText(), assertionText);
	}
	//@Test
	public void personalInformationsButton()
	{
		myAccountPage.myPersonalInformationsClick();
		String assertionText=excelReader.getStringData("TC6", 8, 2);
		assertEquals(myAccountPage.personalInformationsText(), assertionText);
	}
	
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		//driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
	}
	
	public void logIn()
	{
		
		navigator.goToSigninPage();
		signIn.emailInputField("Sumdzigera@gmail.com");
		signIn.passwordInputField("sifra1234");
		signIn.signInButtonClick();
		
		
	}

}
