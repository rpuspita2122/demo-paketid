import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.mile.app/request-demo')

WebUI.click(findTestObject('Object Repository/Page_MileApp/header_LoginRequest Demo'))

'Mengarah ke form Login'
WebUI.click(findTestObject('Page_MileApp/a_Login'))

'Masukkan Nama Perusahaan'
WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Login/input_Back to Mile_organization'), 'paketid')

'Klik Submit login'
WebUI.click(findTestObject('Object Repository/Page_Mileapp  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Mileapp  Login/input_Email Address or Username_email or username'))

'Masukkan Email atau Username'
WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Login/input_Email Address or Username_email or username'), 
    'rimaanggraeni30@gmail.com')

'Masukkan Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mileapp  Login/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

'Check Show Password untuk melihat password'
WebUI.click(findTestObject('Object Repository/Page_Mileapp  Login/span_Password_el-checkbox__inner'))

'Submit Login'
WebUI.click(findTestObject('Object Repository/Page_Mileapp  Login/span_Login'))

WebUI.closeBrowser()

