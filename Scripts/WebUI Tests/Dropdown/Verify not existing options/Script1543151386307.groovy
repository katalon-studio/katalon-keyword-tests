import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static org.assertj.core.api.Assertions.*

import builder.UrlBuilder
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('dropdown'))
TestObject optionsList = findTestObject('WebUI Objects/Page_Dropdown/lst_Options')

// Use different keywords verify an option not existed
WebUI.verifyOptionNotPresentByLabel(optionsList, "Option 3", GlobalVariable.ignoreRegex, GlobalVariable.timeout)
WebUI.verifyOptionNotPresentByLabel(optionsList, /Option 3\b/, !GlobalVariable.ignoreRegex, GlobalVariable.timeout)
WebUI.verifyOptionNotPresentByValue(optionsList, "3", GlobalVariable.ignoreRegex, GlobalVariable.timeout)
WebUI.verifyOptionNotPresentByValue(optionsList, /3\b/, !GlobalVariable.ignoreRegex, GlobalVariable.timeout)
WebUI.verifyOptionNotSelectedByIndex(optionsList, 2, GlobalVariable.timeout)
