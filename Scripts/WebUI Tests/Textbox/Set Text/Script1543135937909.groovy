import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder
import internal.GlobalVariable

TestObject usernameField = findTestObject('WebUI Objects/Page_Login/txt_Username')
TestObject passwordField = findTestObject('WebUI Objects/Page_Login/txt_Password')
TestObject loginButton = findTestObject('WebUI Objects/Page_Login/btn_Login')
TestObject logoutButton = findTestObject('WebUI Objects/Page_Login/btn_Logout')

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('login'))

WebUI.setText(usernameField, 'tomsmith')
WebUI.setText(passwordField, 'SuperSecretPassword!')
WebUI.click(loginButton)
WebUI.verifyTextPresent("You logged into a secure area!", GlobalVariable.ignoreRegex)
WebUI.click(findTestObject('WebUI Objects/Page_Login/btn_Logout'))

WebUI.setMaskedText(usernameField, 'tomsmith')
WebUI.setMaskedText(passwordField, 'SuperSecretPassword!')
WebUI.click(findTestObject('WebUI Objects/Page_Login/btn_Login'))
WebUI.verifyTextPresent("You logged into a secure area!", GlobalVariable.ignoreRegex)
WebUI.click(findTestObject('WebUI Objects/Page_Login/btn_Logout'))

WebUI.setText(usernameField, 'tomsmith')
WebUI.setEncryptedText(passwordField, 'T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI')
WebUI.click(loginButton)
WebUI.verifyTextPresent("You logged into a secure area!", GlobalVariable.ignoreRegex)
WebUI.click(logoutButton)