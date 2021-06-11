package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.MyAccountPage;
import pages.MyAdressesPage;
import pages.NavigationPage;
import pages.SignInPage;

public class BaseTest {
	
	WebDriver driver;
	NavigationPage navigator;
	SignInPage signIn;
	ExcelReader excelReader;
	WebDriverWait wait;
	MyAccountPage myAccountPage;
	MyAdressesPage myAddress;
	
	@BeforeClass
	public void BeforeEveryTests() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		navigator=new NavigationPage(driver);
		signIn=new SignInPage(driver);
		excelReader=new ExcelReader("data/Test plan.xlsx");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, 2);
		myAccountPage=new MyAccountPage(driver);
		myAddress=new MyAdressesPage(driver);
	
	}
	@AfterClass
	public void posleSihTestova() {
		driver.close();
	}
	


}
