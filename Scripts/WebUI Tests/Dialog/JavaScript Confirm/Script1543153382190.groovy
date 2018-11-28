import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder
import internal.GlobalVariable as GlobalVariable

TestObject confirmButton = findTestObject('WebUI Objects/Page_JS Alert/btn_Confirm')

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('javascript_alerts'))
WebUI.click(confirmButton)
WebUI.waitForAlert(GlobalVariable.timeout)
WebUI.dismissAlert()
WebUI.verifyTextPresent('You clicked: Cancel', GlobalVariable.ignoreRegex)