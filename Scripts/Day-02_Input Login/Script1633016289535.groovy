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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//1.Open browser
WebUI.openBrowser('https://www.nopcommerce.com/en/login')
WebUI.maximizeWindow()

//3. Input to Username
WebUI.setText(findTestObject('Object Repository/Page_Nopcommerce/input_Username'), 'thuynguyen')

//4. Input to Password
WebUI.setText(findTestObject('Object Repository/Page_Nopcommerce/input_Password'), 'Password')

//5. Delay 5s
WebUI.delay(5)

//6.Take screenshot
WebUI.takeScreenshot()

//7. Click login
WebUI.click(findTestObject('Object Repository/Page_Nopcommerce/btn_Login'))

//8. Delay 5s
WebUI.delay(5)

//9.Take screenshot
WebUI.takeScreenshot()

//10. Close browser
WebUI.closeBrowser()