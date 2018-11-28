import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder

TestObject usernameField = findTestObject('WebUI Objects/Page_Login/txt_Username')
TestObject passwordField = findTestObject('WebUI Objects/Page_Login/txt_Password')
TestObject loginTitle = findTestObject('WebUI Objects/Page_Login/h2_LoginTitle')
TestObject loginButton = findTestObject('WebUI Objects/Page_Login/btn_Login')

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('login'))
assertThat(WebUI.getText(loginTitle)).isEqualTo('Login Page')
WebUI.sendKeys(usernameField, 'tomsmith')
WebUI.sendKeys(passwordField, 'SuperSecretPassword!')
WebUI.click(loginButton)
WebUI.verifyTextPresent("You logged into a secure area!", false)
