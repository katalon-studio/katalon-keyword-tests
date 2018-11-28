import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import builder.UrlBuilder
import internal.GlobalVariable

TestObject promptButton = findTestObject('WebUI Objects/Page_JS Alert/btn_Prompt')

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('javascript_alerts'))
WebUI.click(promptButton)
WebUI.waitForAlert(GlobalVariable.timeout)
WebUI.setAlertText('Typing some text')
WebUI.dismissAlert()
WebUI.verifyTextPresent('You entered: null', GlobalVariable.ignoreRegex)