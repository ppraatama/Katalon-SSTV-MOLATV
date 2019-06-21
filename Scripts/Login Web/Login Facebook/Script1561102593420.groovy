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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://supersoccer.tv/')

WebUI.click(findTestObject('Object Repository/Login Web/Login Facebook/Page_Live Streaming  Siaran Langsung Sepak Bola/a_Login'))

WebUI.click(findTestObject('Object Repository/Login Web/Login Facebook/Page_Home  SuperSoccer TV/button_Login with Facebook'))

WebUI.setText(findTestObject('Object Repository/Login Web/Login Facebook/Page_Masuk Facebook  Facebook/input_Login ke Facebook_email'), 
    'ppraatama@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Web/Login Facebook/Page_Masuk Facebook  Facebook/input_Login ke Facebook_pass'), 
    'mUBHGO1XptXUd/qVmArlqg==')

WebUI.click(findTestObject('Object Repository/Login Web/Login Facebook/Page_Masuk Facebook  Facebook/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Login Web/Login Facebook/Page_Live Streaming  Siaran Langsung Sepak Bola/div_ProfileLogout'))

WebUI.click(findTestObject('Object Repository/Login Web/Login Facebook/Page_Live Streaming  Siaran Langsung Sepak Bola/a_Logout'))

WebUI.closeBrowser()

