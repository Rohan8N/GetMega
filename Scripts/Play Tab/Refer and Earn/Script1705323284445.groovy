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

'Refer and Earn'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.RadioButton - Refer  Earn (1)'), 0)

'Copy'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (20)'), 0)

'Share'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (21)'), 0)

'B'
Mobile.pressBack()

'Refer and Earn'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.RadioButton - Refer  Earn (1)'), 0)

'Know More'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Know More (6)'), 0)

'Close'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.RelativeLayout (1)'), 0)

'Invited Friends'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Invited friends'), 0)

'My Earnings'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - My earnings (1)'), 0)

'B'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (22)'), 0)

