import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('dropdown'))
TestObject optionsList = findTestObject('WebUI Objects/Page_Dropdown/lst_Options')

assertThat(WebUI.getNumberOfSelectedOption(optionsList)).isEqualTo(1)
assertThat(WebUI.getNumberOfTotalOption(optionsList)).isEqualTo(3)

WebUI.verifyOptionPresentByLabel(optionsList, "Option 1", GlobalVariable.ignoreRegex, GlobalVariable.timeout)
WebUI.verifyOptionPresentByValue(optionsList, "1", GlobalVariable.ignoreRegex, GlobalVariable.timeout)
WebUI.verifyOptionsPresent(optionsList, ['Option 1', 'Option 2'])

WebUI.selectOptionByLabel(optionsList, "Option 1", GlobalVariable.ignoreRegex)
WebUI.verifyOptionSelectedByLabel(optionsList, "Option 1", GlobalVariable.ignoreRegex, GlobalVariable.timeout)

WebUI.selectOptionByLabel(optionsList, /Option 1\b/, !GlobalVariable.ignoreRegex)
WebUI.verifyOptionSelectedByLabel(optionsList, /Option 1\b/, !GlobalVariable.ignoreRegex, GlobalVariable.timeout)

WebUI.selectOptionByValue(optionsList, "1", GlobalVariable.ignoreRegex)
WebUI.verifyOptionSelectedByValue(optionsList, "1", GlobalVariable.ignoreRegex, GlobalVariable.timeout)

WebUI.selectOptionByValue(optionsList, /1\b/, !GlobalVariable.ignoreRegex)
WebUI.verifyOptionSelectedByValue(optionsList, /1\b/, !GlobalVariable.ignoreRegex, GlobalVariable.timeout)

WebUI.selectOptionByIndex(optionsList, 1)
WebUI.verifyOptionSelectedByIndex(optionsList, 1, GlobalVariable.timeout)


