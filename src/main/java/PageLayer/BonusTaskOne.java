package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class BonusTaskOne extends BaseClass {

	@FindBy(xpath = "//div[@class='amber-vjbh7u']")
	private WebElement search;

	@FindBy(xpath = "//div[@class='amber-Text-root amber-1mirppv']")
	private List<WebElement> location;

	public BonusTaskOne() {
		PageFactory.initElements(driver, this);
	}

	public void searchBar() {
		UtilsClass.click(search);
	}

	public List<WebElement> checkCity() {
		List<WebElement> city = location;
		return city;
	}
}
