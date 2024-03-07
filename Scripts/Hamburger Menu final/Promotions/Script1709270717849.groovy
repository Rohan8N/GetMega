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

'Profile Icon'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.ImageView'), 0)

'Promotions\r\n'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.TextView - Promotions'), 0)

'Refer Now'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.ImageView (1)'), 0)

'B'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.ImageView (2)'), 0)

'KYC'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.ImageView (3)'), 0)

'B'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.ImageView (4)'), 0)

'Mega Credits'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.ImageView (5)'), 0)

'B'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.ImageView (2)'), 0)

'B'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.ImageView (2)'), 0)

