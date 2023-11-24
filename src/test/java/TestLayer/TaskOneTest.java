package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.Task_One;

public class TaskOneTest extends BaseClass {

	private static Task_One taskOne;

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test(priority = 1)
	public void validateSearchCity() {
		taskOne = new Task_One();
		taskOne.searchCity();
	}

	@Test(priority = 2)
	public void validateSelectCountry() {
		taskOne = new Task_One();
		taskOne.selectCountry();
	}

	@Test(priority = 3)
	public void validateSelectLocation() {
		taskOne = new Task_One();
		taskOne.selectLocation();
	}

	@Test(priority = 4)
	public void validateFilterResult() {
		taskOne = new Task_One();
		taskOne.filterResults();
	}

	@Test(priority = 5)
	public void ValidateSelectRoom() {
		taskOne = new Task_One();
		taskOne.selectRoom();
	}

	@Test(priority = 6)
	public void validateSelectSharing() {
		taskOne = new Task_One();
		taskOne.selectSharing();
	}

	@Test(priority = 7)
	public void validateClickOnSearch() {
		taskOne = new Task_One();
		taskOne.clickOnSearch();
	}

	@Test(priority = 8)
	public void validateClickOnResult() {
		taskOne = new Task_One();
		taskOne.clickOnResult();
	}

	@Test(priority = 9)
	public void validateGetTitle() {
		taskOne = new Task_One();
		String title = taskOne.getTitle();
		String expectedCity = prop.getProperty("city");
		Boolean b = title.contains(expectedCity);
		Assert.assertTrue(b);
	}

	@AfterTest
	public void endTask() {
		driver.close();
	}

}
