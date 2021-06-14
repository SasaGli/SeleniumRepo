package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.MyAdressesPage;

public class AddresTest extends MyAccountTest{
	@Test(priority=10)
	public void updateAddress() {
		myAccountPage.myAddressesClick();
		myAddress.updateButtonClick();
		myAddress.address().clear();
		myAddress.newAddress(excelReader.getStringData("TC8",9,2));
		myAddress.saveButtonClick();
		assertEquals(myAddress.addressText(), excelReader.getStringData("TC8",13,2));
	}
	@Test(priority=20)
	public void deleteAddress() throws InterruptedException {
		myAccountPage.myAddressesClick();
		myAddress.deleteButtonClick();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	@Test(priority=5)
	
	public void addAddress() throws InterruptedException {
		
		myAccountPage.myAddressesClick();
		myAddress.addAddresButtonClick();
		myAddress.firstnameClear();
		myAddress.firstname(excelReader.getStringData("TC10",8,2));
		myAddress.lastnameClear();
		myAddress.lastname(excelReader.getStringData("TC10",9,2));
		myAddress.newAddress(excelReader.getStringData("TC10",10,2));
		myAddress.city(excelReader.getStringData("TC10",11,2));
		myAddress.postcode(excelReader.getStringData("TC10",13,2));
		Thread.sleep(4000);
		myAddress.state(excelReader.getStringData("TC10",12,2));
		Thread.sleep(4000);
		myAddress.country(excelReader.getStringData("TC10",14,2));
		Thread.sleep(4000);
		myAddress.phone(excelReader.getStringData("TC10",15,2));
		myAddress.phone_mobile(excelReader.getStringData("TC10",16,2));
		myAddress.saveButtonClick();
		assertEquals(myAddress.addressText(),excelReader.getStringData("TC10",19,2));
	
	}
}


