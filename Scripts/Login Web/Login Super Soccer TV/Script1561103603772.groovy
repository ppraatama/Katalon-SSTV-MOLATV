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

WebUI.click(findTestObject('Object Repository/Login Web/Login Super Soccer TV/Page_Live Streaming  Siaran Langsung Sepak Bola/a_Login'))

WebUI.setText(findTestObject('Object Repository/Login Web/Login Super Soccer TV/Page_Home  SuperSoccer TV/input_Email  Phone_id'), 
    'ppraataamaa@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Web/Login Super Soccer TV/Page_Home  SuperSoccer TV/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Login Web/Login Super Soccer TV/Page_Home  SuperSoccer TV/button_Next'))

WebUI.click(findTestObject('Object Repository/Login Web/Login Super Soccer TV/Page_Live Streaming  Siaran Langsung Sepak Bola/div_ProfileLogout'))

WebUI.click(findTestObject('Object Repository/Login Web/Login Super Soccer TV/Page_Live Streaming  Siaran Langsung Sepak Bola/a_Logout'))

WebUI.closeBrowser()

