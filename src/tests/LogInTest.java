package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{
	@BeforeMethod
	public void beforeTest()
	{
		driver.navigate().to("http://automationpractice.com/index.php");
		navigator.goToSigninPage();
		
	}
	
	@Test
	public void signIn() throws InterruptedException
	{
		
		
		signIn.emailInputField(excelReader.getStringData("TC1", 6, 2));
		signIn.passwordInputField(excelReader.getStringData("TC1", 7, 2));
		signIn.signInButtonClick();
		String assertText=excelReader.getStringData("TC1", 8, 2);
		assertEquals(assertText, signIn.profileName());
		Thread.sleep(3000);
		
	}
	@Test(priority=0)
	public void signInNoCredentials() throws InterruptedException
	{
		signIn.emailInputField(excelReader.getStringData("TC2", 6, 2));
		signIn.passwordInputField(excelReader.getStringData("TC2", 7, 2));
		signIn.signInButtonClick();
		String assertText=excelReader.getStringData("TC2", 10, 2);
		assertEquals(assertText, signIn.errorMessage());
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void signInBadPassword() throws InterruptedException
	{
		signIn.emailInputField(excelReader.getStringData("TC2", 6, 3));
		signIn.passwordInputField(excelReader.getStringData("TC2", 7, 3));
		signIn.signInButtonClick();
		String assertText=excelReader.getStringData("TC2", 10, 3);
		assertEquals(assertText, signIn.errorMessage());
		Thread.sleep(3000);
	}@Test(priority=6)
	public void signInBadEmail() throws InterruptedException
	{
		signIn.emailInputField(excelReader.getStringData("TC2", 6, 4));
		signIn.passwordInputField(excelReader.getStringData("TC2", 7, 4));
		signIn.signInButtonClick();
		String assertText=excelReader.getStringData("TC2", 10, 4);
		assertEquals(assertText, signIn.errorMessage());
		Thread.sleep(3000);
	}
	@Test(priority=9)
	public void signInNoPassword() throws InterruptedException
	{
		signIn.emailInputField(excelReader.getStringData("TC2", 6, 5));
		signIn.passwordInputField(excelReader.getStringData("TC2", 7, 5));
		signIn.signInButtonClick();
		String assertText=excelReader.getStringData("TC2", 10, 2);
		assertEquals(assertText, signIn.errorMessage());
		Thread.sleep(3000);
	}@Test(priority=12)
	public void signInNoEmail() throws InterruptedException
	{
		signIn.emailInputField(excelReader.getStringData("TC2", 6, 6));
		signIn.passwordInputField(excelReader.getStringData("TC2", 7, 6));
		signIn.signInButtonClick();
		String assertText=excelReader.getStringData("TC2", 10, 6);
		assertEquals(assertText, signIn.errorMessage());
		Thread.sleep(3000);
		
	}
	
	
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}
