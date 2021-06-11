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
		myAddress.newAddress("Marka Miljanova");
		myAddress.saveButtonClick();
		assertEquals(myAddress.addressText(), "Marka Miljanova");
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
		myAddress.firstname("Marko");
		myAddress.lastname("Nikolic");
		myAddress.newAddress("Milentije Mirina");
		myAddress.city("Novi Sad");
		myAddress.postcode("21241");
		Thread.sleep(4000);
		myAddress.state("Alabama");
		Thread.sleep(4000);
		myAddress.country("United States");
		Thread.sleep(4000);
		myAddress.phone("155455454");
		myAddress.phone_mobile("54654545");
		myAddress.saveButtonClick();
		assertEquals(myAddress.addressText(), "Milentije Mirina");
	}

}
