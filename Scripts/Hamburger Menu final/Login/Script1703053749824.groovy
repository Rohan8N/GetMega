import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
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

Mobile.startApplication('C:\\APKs for Automations\\GetMegaPoker.apk', true)

'Update Later'
TestObject update=findTestObject('Object Repository/Hamburger Menu/Help and Support/android.widget.TextView - Skip, Ill update Later')
if (Mobile.verifyElementVisible(update, 0, FailureHandling.OPTIONAL))
{
Mobile.tap(update, 0)
}
else {}


//Lets add If statement for Non of the above
//store it in a variable
'Allow'
TestObject allow = findTestObject('Object Repository/Login/android.widget.Button - Allow')

if (Mobile.verifyElementVisible(allow, 10, FailureHandling.OPTIONAL)) {
    Mobile.tap(allow, 0 )//Not visible
        
}
else {
}

//Lets add If statement for Non of the above
//store it in a variable
'None of the above'
TestObject nota = findTestObject('Object Repository/Login/android.widget.Button - NONE OF THE ABOVE')

if (Mobile.verifyElementVisible(nota, 10, FailureHandling.OPTIONAL)) {
    Mobile.tap(nota, 0 //Not visible
        )
} else {
}

'Need help\r\n'
Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - Need help'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Login/android.widget.AutoCompleteTextView - Type a message'), 'Test Messege')

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageView (2)'), 0)

WebUI.delay(5)

'Back'
Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton'), 0)

//Lets add If statement for Non of the above
//store it in a variable
'None of the above'
if (Mobile.verifyElementVisible(nota, 10, FailureHandling.OPTIONAL)) {
    Mobile.tap(nota, 0 //Not visible
        )
} else {
}

'Terms & conditions'
Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - Terms and Conditions'), 0)

WebUI.delay(5)

'Back'
Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageView (1)'), 0)

//Lets add If statement for Non of the above
//store it in a variable
'None of the above'
if (Mobile.verifyElementVisible(nota, 10, FailureHandling.OPTIONAL)) {
    Mobile.tap(nota, 0 //Not visible
        )
} else {
}

'Privacy Policy'
Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - Privacy Policy'), 0)

WebUI.delay(5)

'Back'
Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageView (1)'), 0)

//Lets add If statement for Non of the above
//store it in a variable
'None of the above'
if (Mobile.verifyElementVisible(nota, 10, FailureHandling.OPTIONAL)) {
    Mobile.tap(nota, 0 //Not visible
        )
} else {
}

'Referral code'
Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - Have a Referral Code'), 0)

'Mobile number'
Mobile.sendKeys(findTestObject('Object Repository/Login/android.widget.EditText - Enter Mobile Number'), '2345678913')

'Continue'
Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - CONTINUE'), 0)

'OTP 1'
Mobile.sendKeys(findTestObject('Object Repository/Login/android.widget.EditText'), '9')

'OTP 2'
Mobile.sendKeys(findTestObject('Object Repository/Login/android.widget.EditText (1)'), '6')

'OTP 3'
Mobile.sendKeys(findTestObject('Object Repository/Login/android.widget.EditText (2)'), '3')

'OTP 4'
Mobile.sendKeys(findTestObject('Object Repository/Login/android.widget.EditText (3)'), '2')

'OTP 5'
Mobile.sendKeys(findTestObject('Object Repository/Login/android.widget.EditText (4)'), '4')

'OTP 6'
Mobile.sendKeys(findTestObject('Object Repository/Login/android.widget.EditText (5)'), '8')

WebUI.delay(5)

