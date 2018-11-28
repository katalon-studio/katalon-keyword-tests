import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder
import internal.GlobalVariable as GlobalVariable

TestObject alertButton = findTestObject('WebUI Objects/Page_JS Alert/btn_Alert')

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('javascript_alerts'))
WebUI.click(alertButton)
WebUI.waitForAlert(GlobalVariable.timeout)

// Alert is displayed. We verify the text and accept the alert.
if (WebUI.verifyAlertPresent(GlobalVariable.timeout) == true) {
	assert WebUI.getAlertText() == "I am a JS Alert"
	WebUI.acceptAlert()
}

