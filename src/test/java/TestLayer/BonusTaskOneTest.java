package TestLayer;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.BonusTaskOne;

public class BonusTaskOneTest extends BaseClass {

	private static BonusTaskOne bonusTaskOne;

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test(priority = 1)
	public void validateSearchBar() {
		bonusTaskOne = new BonusTaskOne();
		bonusTaskOne.searchBar();
	}

	@Test(priority = 2)
	public void validateCheckCity() {
		bonusTaskOne = new BonusTaskOne();
		List<WebElement> city = bonusTaskOne.checkCity();
		List<String> cities = city.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(cities);
	}

	@AfterTest
	public void endTask() {
		driver.close();
	}

}
