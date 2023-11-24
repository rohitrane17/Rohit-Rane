package UtilsLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	
	public static void sendKeys(WebElement wb, String value) {
		if(wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}
	
	public static void click(WebElement wb) {
		if(wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}
	
	public static void clickOnCheckbox(List<WebElement> ls) {
		for(WebElement wb:ls) {
			wb.click();		}
	}
	
	public static WebElement explicitWait(By by, Long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
