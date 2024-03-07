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

'Wallet'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.RadioButton - Wallet (1)'), 0)

'Deposit Bal'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Deposit Balance (1)'), 0)

'Deposit Bal Close'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (18)'), 0)

'Winning Bal'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Winnings balance'), 0)

'Winning Bal Close'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (18)'), 0)

'Mega Credits'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Mega Credits (2)'), 0)

'Mega Credits Close'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (18)'), 0)

'Bonus Bal'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Bonus Balance (1)'), 0)

'Bonus Bal Close'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (18)'), 0)

'TDS'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - TDS (2)'), 0)

'TDS Close'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (18)'), 0)

'MC-Know More'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Know More (3)'), 0)

'Back'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (19)'), 0)

'BB-Know More'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Know More (4)'), 0)

'Back'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (19)'), 0)

'TDS-Know More'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Know More (5)'), 0)

'Back'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Wallet (1)'), 0)

'KYC Required'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - KYC Required (1)'), 0)

'B'
Mobile.pressBack()

'Wallet'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.RadioButton - Wallet (1)'), 0)

'Transactions'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Transactions'), 0)

'Deposit'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Deposit'), 0)

'Some Deposit'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (9)'), 0)

'Close'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (10)'), 0)

'Withdrawal'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Withdrawal'), 0)

'TDS'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - TDS (1)'), 0)

'Mega Credits'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Mega credits (1)'), 0)

'Some MC'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Bonus'), 0)

'Close'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (11)'), 0)

'Game logs'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Game Logs'), 0)

'Some log'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (12)'), 0)

'Close'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.ImageView (11)'), 0)

'Wallet'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.TextView - Wallet'), 0)

'Add Cash in Wallet'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.Button - ADD CASH'), 0)

'Dont know'
0

'Set 1000 rs'
Mobile.setText(findTestObject('Object Repository/Hamburger Menu/android.widget.EditText - 50'), '1000', 0)

'B'
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

'B'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.ImageView (3)'), 0)

'B'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.ImageView (3)'), 0)

'B'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Deposits/android.widget.ImageView (3)'), 0)

