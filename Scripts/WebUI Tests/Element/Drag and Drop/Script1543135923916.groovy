import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder

TestObject sourceObject = findTestObject('WebUI Objects/Page_Drag and Drop/div_Drag')
TestObject destObject = findTestObject('WebUI Objects/Page_Drag and Drop/div_Drop')

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('drag_and_drop'))
WebUI.dragAndDropToObject(sourceObject, destObject)