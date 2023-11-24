package UtilsLayer;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass {
	
	public static void  clickOnOkButton() {
		driver.switchTo().alert().accept();
	}
	
	public static void cliclOnCancelButton() {
		driver.switchTo().alert().dismiss();
	}
	
	public static String captureAlertPopText() {
		return driver.switchTo().alert().getText();
	}
	
	public static void enterDate(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

}
