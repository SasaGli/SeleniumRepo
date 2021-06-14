package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PersonalInfoTest extends MyAccountTest {
	@Test
	public void updatePersonalInfo() throws InterruptedException
	{
		myAccountPage.myPersonalInformationsClick();
		personalInfo.radioButonClick(excelReader.getStringData("TC11", 7, 2));
		personalInfo.username().clear();
		personalInfo.enterUsername(excelReader.getStringData("TC11", 8, 2));
		personalInfo.lastname().clear();
		personalInfo.enterlastname(excelReader.getStringData("TC11", 9, 2));
		personalInfo.email().clear();
		personalInfo.enteremail(excelReader.getStringData("TC11", 10, 2));
		personalInfo.enterpassword(excelReader.getStringData("TC11", 11, 2));
		personalInfo.saveButonClick();
		Thread.sleep(4000);
		assertEquals(personalInfo.confirmationMessage(),excelReader.getStringData("TC11", 14, 2));
	}

}
