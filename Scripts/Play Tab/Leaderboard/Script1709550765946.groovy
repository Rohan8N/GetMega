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

'Leaderboard'
Mobile.tap(findTestObject('Object Repository/Play Tab/android.widget.RadioButton - Leaderboard'), 0)

WebUI.delay(5)

'Today'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Today'), 0)

'Yesterday'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Yesterday'), 0)

'Yesterday'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Yesterday (1)'), 0)

'Tomorrow'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Tomorrow'), 0)

'Tomorrow 1'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Tomorrow (1)'), 0)

'Today 1'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Today (1)'), 0)

'Game all'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Game All'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (1)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (1)'), 0)

'Game all'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Game All (1)'), 0)

'Table all'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Table All'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (1)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (1)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (2)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (2)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (3)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (3)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (4)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (4)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (5)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (5)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (6)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (6)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (7)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (7)'), 0)

'Table all'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Table All (1)'), 0)

'Reward'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Reward'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Deposit'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Deposit'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Bonus'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Bonus'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Gadgets'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Gadgets'), 0)

'Reward'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Reward (1)'), 0)

'Type'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Type'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Hourly'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Hourly'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Daily'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Daily'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Weekly'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Weekly'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Monthly'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Monthly'), 0)

'Type'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Type (1)'), 0)

'Scoring'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Scoring'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Deposit (1)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Deposit (1)'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Winning'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Winning'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Number of Games'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Number of Games'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Withdrawal'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Withdrawal'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Rake'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Rake'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Net Winning'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Net Winning'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Referrals Count'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Referrals Count'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Referrals Deposits'), 
    0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Referrals Deposits'), 
    0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Referrals Wagering'), 
    0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Referrals Wagering'), 
    0)

'Scoring'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Scoring (1)'), 0)

'Status'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Status'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Live'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Live'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Upcoming'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Upcoming'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Completed'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Completed'), 0)

'Status'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Status (1)'), 0)

'My leaderboard Button'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.Button'), 0)

'My leaderboard Button'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.Button (1)'), 0)

'Sort'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Sort'), 0)

'CB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.CheckBox (8)'), 0)

'Apply'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.Button - APPLY'), 0)

'Sort'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Sort'), 0)

'Clear all'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.Button - CLEAR ALL'), 0)

'Apply'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.Button - APPLY'), 0)

'Leaderboard Icon'
Mobile.tap(findTestObject('New/android.widget.LinearLayout'), 0)

'Leaderboard Under LB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Leaderboard (3)'), 0)

'Play Now Under LB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Play Now (1)'), 0)

'Leaderboard'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.RadioButton - Leaderboard (1)'), 
    0)

'Leaderboard Icon'
Mobile.tap(findTestObject('New/android.widget.LinearLayout'), 0)

'Leaderboard Under LB'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Leaderboard (3)'), 0)

'Join Now'
Mobile.tap(findTestObject('Object Repository/Hamburger Menu/Leaderboard/android.widget.TextView - Join Now (1)'), 0)

