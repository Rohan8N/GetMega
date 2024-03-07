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
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.ImageView'), 0)

'View Profile'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.TextView - View profile'), 0)

'B'
Mobile.pressBack()

'Profile Icon'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.ImageView'), 0)

'B'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.ImageView (1)'), 0)

'Profile Icon'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.ImageView'), 0)

'My Account'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.TextView - My Account'), 0)

'Update'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.Button - UPDATE'), 0)

'Display Name'
Mobile.sendKeys(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.EditText - Enter Display Name'), 
    'katalon123')

'Submit'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.Button - SUBMIT'), 0)

'Name'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.EditText - katalon'), 'katalon', 
    0)

'Last Name'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.EditText - studio'), 'studio', 
    0)
/*
Mobile.clearText(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.EditText - 01 Jan 200001 Jan 2000'), 
    0)

Mobile.setText(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.EditText'), '01 Jan 2000', 
    0)
*/
'B'
Mobile.pressBack()

'Gender'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.TextView - Male'), 0)

'City'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.EditText - city'), 'city', 
    0)

'B'
Mobile.pressBack()

'Street'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.EditText - street'), 'street', 
    0)

'B'
Mobile.pressBack()

'Enter City'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.EditText - bangalore'), 'bangalore', 
    0)

'B'
Mobile.pressBack()

'Enter Pincode'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.EditText - 560001'), '560001', 
    0)

'B'
Mobile.pressBack()

'Scroll-News Letters'
Mobile.scrollToText('News Letters')

'State'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.TextView - KARNATAKA'), 0)

'Select State'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.CheckedTextView - KARNATAKA'), 
    0)

'Update'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-fff/android.widget.TextView - UPDATE'), 0)

'Scroll-News Letters'
Mobile.scrollToText('News Letters')

'Email-off'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - Off'), 0)

'Email-On'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - On'), 0)

'SMS-Off'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - Off (1)'), 0)

'SMS-On'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - On (1)'), 0)

'Phone-Off'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - Off (2)'), 0)

'Phone-On'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - On (2)'), 0)

'NewsLetters-Off'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - Off (3)'), 0)

'NewsLetters-On'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - On (3)'), 0)

'KYC'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.TextView - KYC'), 0)

'Add-Aadhaar'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - ADD'), 0)

'Aadhaar Number'
Mobile.sendKeys(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.EditText - Aadhaar Number'), 
    '111122223333')

'Browse'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - BROWSE'), 0)

'Close'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.ImageView (2)'), 0)

'B'
Mobile.pressBack()

'Add-Pan'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - ADD (1)'), 0)

'PAN'
Mobile.sendKeys(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.EditText - PAN'), 'BRCPNO509S')

'Browse'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - BROWSE (1)'), 0)

'Close'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.ImageView (3)'), 0)

'B'
Mobile.pressBack()

'Bank Details'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.TextView - Bank Details'), 0)

'SBI'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.LinearLayout'), 0)

'Delete'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - DELETE ACCOUNT'), 0)

'UPI'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.TextView - testupi'), 0)

'Delete'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - DELETE ACCOUNT (1)'), 0)

'AddUPI'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.TextView - Add UPI ID'), 0)

'Enter UPI Id'
Mobile.sendKeys(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.EditText (3)'), 'test@upi')

'Add UPI'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - ADD UPI'), 0)

'Add Bank'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.TextView - Add Bank Details'), 0)

'Acc Holder Name'
Mobile.sendKeys(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.EditText (4)'), 'katalon')

'Bank Name'
Mobile.sendKeys(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.EditText (5)'), 'SBI')

'Acc Number'
Mobile.sendKeys(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.EditText (6)'), '1234567890')

'IFSC'
Mobile.sendKeys(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.EditText (7)'), 'SBIN00316')

'Add Bank '
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/My Account-1/android.widget.Button - ADD BANK'), 0)

'B'
Mobile.pressBack()

