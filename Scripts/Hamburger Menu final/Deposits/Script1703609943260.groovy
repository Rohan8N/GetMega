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
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.ImageView'), 0)

'Playable bal'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/android.widget.TextView - Playable Balance'), 0)

'Set 1000 rs'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/android.widget.EditText - 50'), '1000', 0)

Mobile.pressBack()

'View Codes'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.TextView - View Codes'), 0)

'Close'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.ImageView (4)'), 0)

'Add cash'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.Button - ADD CASH 1,000 (1)'), 0)

'Add cash'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.Button - ADD CASH 1,000 (1)'), 0)

'Credit/Debit Card'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.TextView - Credit  Debit Card'), 0)

'Edit Number'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.EditText - 2345678913'), '2345678913', 
    0)

'Edit Email'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.EditText - testusergetmega.com'), 
    'testuser@getmega.com', 0)

'Proceed'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.Button - Proceed to Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.ImageView (3)'), 0)

