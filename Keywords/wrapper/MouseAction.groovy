package wrapper

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.StaleElementReferenceException

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import utils.Element
import utils.Log
import com.kms.katalon.core.testobject.TestObject as TestObject

public class MouseAction {
	@Keyword
	def click(TestObject to) {
		try {
			Log.logInfo("Click on the element using built-in keyword")
			WebUI.click(to)
		}
		catch (StaleElementReferenceException sere) {
			Log.logInfo("Retry clicking on the element in the refreshed DOM")
			WebUI.waitForElementClickable(to, GlobalVariable.timeout)
			WebUI.click(to)
		}
		catch (Exception e) {
			Log.logInfo("Click on the element using JavaScript snippet")
			Element.clickUsingJavaScript(to)
		}
	}
}
