package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class Task_One extends BaseClass {

	@FindBy(xpath = "//div[@class='amber-vjbh7u']")
	private WebElement search;

	@FindBy(xpath = "//button[contains(.,'UK')]")
	private WebElement country;

	@FindBy(xpath = "//div[@class='amber-Text-root amber-1mirppv']")
	private List<WebElement> location;

	public Task_One() {
		PageFactory.initElements(driver, this);
	}

	public void searchCity() {
		UtilsClass.click(search);
	}

	public void selectCountry() {
		UtilsClass.click(country);
	}

	public void selectLocation() {
		List<WebElement> place = location;
		WebElement loc = location.stream().filter(c -> c.getText().equalsIgnoreCase(prop.getProperty("city")))
				.findFirst().orElse(null);
		UtilsClass.click(loc);
	}

	@FindBy(xpath = "//span[contains(.,'More Filters')]")
	private WebElement filters;

	@FindBy(xpath = "//label[contains(.,'Private Room')]")
	private WebElement roomType;

	@FindBy(xpath = "//label[contains(.,'Private Bathroom')]")
	private WebElement sharing;

	@FindBy(xpath = "//button[@class='amber-UnstyledButton-root amber-Button-root amber-1abcetc']")
	private WebElement searchResult;

	@FindBy(xpath = "//h2[@class='amber-Text-root amber-Title-root amber-5elmvi']")
	private List<WebElement> selection;

	public void filterResults() {
		UtilsClass.click(filters);
	}

	public void selectRoom() {
		UtilsClass.click(roomType);
	}

	public void selectSharing() {
		UtilsClass.click(sharing);
	}

	public void clickOnSearch() {
		UtilsClass.click(searchResult);
	}

	public void clickOnResult() {
		selection.get(1).click();
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

}
