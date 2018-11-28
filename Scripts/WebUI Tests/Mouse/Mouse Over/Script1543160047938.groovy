import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder
import internal.GlobalVariable as GlobalVariable

TestObject avatarImage = findTestObject('WebUI Objects/Page_Hovers/img_Avatar1')
WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('hovers'))
WebUI.mouseOver(avatarImage)
WebUI.verifyTextPresent("name: user1", GlobalVariable.ignoreRegex)