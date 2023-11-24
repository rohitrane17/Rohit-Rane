package UtilsLayer;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	
	public static void selectByVisibleText(WebElement wb, String value) {
		new Select(wb).selectByVisibleText(value);
	}
	
	public static void selectByValue(WebElement wb, String value) {
		new Select(wb).selectByValue(value);
	}
	
	public static void selectByIndex(WebElement wb,int index) {
		new Select(wb).selectByIndex(index);
	}
	
	public static String captureSelectedValue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}
	
	public static int getCount(WebElement wb) {
		return new Select(wb).getOptions().size();
	}
	
	public static void printAllValues(WebElement wb) {
		List<WebElement> ls = new Select(wb).getOptions();
		List<String> allValues = ls.stream().map(count -> count.getText()).collect(Collectors.toList());
		System.out.println(allValues);
	}
	
	public static boolean checkSpecificValue(WebElement wb, String value) {
		List<WebElement> ls = new Select(wb).getOptions();
		
		for(WebElement abc: ls) {
			if(abc.getText().equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}

}
