package utils

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Element {
	public static void clickUsingJavaScript (TestObject to) {
		//Log.logInfo("Click on " + to.getObjectId() + " using JavaScript")
		WebElement element = WebUiCommonHelper.findWebElement(to,GlobalVariable.timeout)
		WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))
	}
}
