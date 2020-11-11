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

WebUI.openBrowser('https://dev.mile.app/request-demo')

WebUI.click(findTestObject('Object Repository/Page_MileApp/a_Login'))

'Mengarah ke form Login terlebih dahulu'
WebUI.navigateToUrl('https://taskdev.mile.app/login')

'Jika belum terdaftar, klik button Contact Us\r\n'
WebUI.click(findTestObject('Object Repository/Page_Mileapp  Login/a_Contact us'))

'Masukkan Nama\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Full name_name'), 'Rima ')

'Masukkan Email\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Email_email'), 'rimaanggraeni30@gmail.com')

'Masukkan nomor hp'
WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Phone number_phone'), '8977185794')

'Masukkan nama perusahaan'
WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Company name_organization_name'), 'testqa paket id')

'Klik submit '
WebUI.click(findTestObject('Object Repository/Page_Mileapp  Request Demo/button_Request Demo'))

WebUI.closeBrowser()

