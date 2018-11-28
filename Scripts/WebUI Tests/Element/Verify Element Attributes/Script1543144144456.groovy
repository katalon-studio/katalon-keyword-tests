import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static org.assertj.core.api.Assertions.*

TestObject homepageTitle = findTestObject('WebUI Objects/Page_Homepage/h1_Homepage')

WebUI.verifyElementAttributeValue(homepageTitle, 'class', 'heading', GlobalVariable.timeout)
WebUI.verifyElementClickable(findTestObject('WebUI Objects/Page_Homepage/btn_Fork'))
WebUI.verifyElementHasAttribute(homepageTitle, 'class', GlobalVariable.timeout)
WebUI.verifyElementVisible(homepageTitle)
WebUI.verifyElementVisibleInViewport(homepageTitle, GlobalVariable.timeout)


