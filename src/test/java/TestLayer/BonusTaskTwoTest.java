package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.BonusTaskTwo;

public class BonusTaskTwoTest extends BaseClass {

	private static BonusTaskTwo bonusTaskTwo;

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	// @Test(priority = 1)
	// public void validateLogin() throws InterruptedException{
	// bonusTaskTwo = new BonusTaskTwo();
	// bonusTaskTwo.login();
	// }

	@Test(priority = 2)
	public void validateSearchCity() {
		bonusTaskTwo = new BonusTaskTwo();
		bonusTaskTwo.searchCity();
	}

	@Test(priority = 3)
	public void validateSelectCountry() {
		bonusTaskTwo = new BonusTaskTwo();
		bonusTaskTwo.selectCountry();
	}

	@Test(priority = 4)
	public void validateSelectLocation() {
		bonusTaskTwo = new BonusTaskTwo();
		bonusTaskTwo.selectLocation();
	}

	@Test(priority = 5)
	public void validateFilterResult() {
		bonusTaskTwo = new BonusTaskTwo();
		bonusTaskTwo.filterResults();
	}

	@Test(priority = 6)
	public void ValidateSelectRoom() {
		bonusTaskTwo = new BonusTaskTwo();
		bonusTaskTwo.selectRoom();
	}

	@Test(priority = 7)
	public void validateSelectSharing() {
		bonusTaskTwo = new BonusTaskTwo();
		bonusTaskTwo.selectSharing();
	}

	@Test(priority = 8)
	public void validateClickOnSearch() {
		bonusTaskTwo = new BonusTaskTwo();
		bonusTaskTwo.clickOnSearch();
	}

	@Test(priority = 9)
	public void validateClickOnResult() {
		bonusTaskTwo = new BonusTaskTwo();
		bonusTaskTwo.clickOnResult();
	}

	@Test(priority = 10)
	public void validateGetTitle() {
		bonusTaskTwo = new BonusTaskTwo();
		String title = bonusTaskTwo.getTitle();
		String expectedCity = prop.getProperty("city");
		Boolean b = title.contains(expectedCity);
		Assert.assertTrue(b);
	}

	@Test(priority = 11)
	public void validateShortlist() {
		bonusTaskTwo = new BonusTaskTwo();
		bonusTaskTwo.shortlistRoom();

	}

	@AfterTest
	public void endTask() {
		driver.close();
	}

}
