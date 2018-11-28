import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('checkboxes'))

TestObject firstCheckbox = findTestObject('WebUI Objects/Page_Checkboxes/chk_Checkbox 1')
TestObject secondCheckbox = findTestObject('WebUI Objects/Page_Checkboxes/chk_Checkbox 2')

// Checkbox 1 is checked by default. 
// Use other keywords to verify its state.
assertThat(WebUI.verifyElementNotChecked(firstCheckbox, GlobalVariable.timeout, FailureHandling.OPTIONAL)).isTrue()
assertThat(WebUI.verifyElementChecked(firstCheckbox, GlobalVariable.timeout, FailureHandling.OPTIONAL)).isFalse()

// Checkbox 2 is checked by default
// We need to un-check it using uncheck keyword
WebUI.uncheck(secondCheckbox)
assertThat(WebUI.verifyElementNotChecked(secondCheckbox, GlobalVariable.timeout, FailureHandling.OPTIONAL)).isTrue()

