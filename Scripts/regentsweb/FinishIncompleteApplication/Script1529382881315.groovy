import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://devaccount.regentsscholarship.org/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Login - Regents Scholarship (1)/input_username'), 'tdrs061818c')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship (1)/input_password'), 'Welcome01')

WebUI.sendKeys(findTestObject('Page_Login - Regents Scholarship (1)/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Home  Regents Scholarship (1)/button_Complete Now'))

WebUI.scrollToElement(findTestObject('Page_Home  Regents Scholarship (1)/button_Continue'), 0)

WebUI.click(findTestObject('Page_Home  Regents Scholarship (1)/button_Continue'))

WebUI.click(findTestObject('Page_Personal Information (1)/button_Close'))

WebUI.click(findTestObject('Page_Personal Information (1)/input_notifyOption'))

WebUI.click(findTestObject('Page_Personal Information (1)/span_Prev'))

WebUI.click(findTestObject('Page_Personal Information (1)/span_Prev'))

WebUI.click(findTestObject('Page_Personal Information (1)/span_Prev'))

WebUI.click(findTestObject('Page_Personal Information (1)/span_Prev'))

WebUI.click(findTestObject('Page_Personal Information (1)/a_2'))

WebUI.setText(findTestObject('Page_Personal Information (1)/input_personalInfoDTO.ssn'), '999-99-9997')

WebUI.setText(findTestObject('Page_Personal Information (1)/input_pinNumber'), '9997')

WebUI.click(findTestObject('Page_Personal Information (1)/div_Please create a 4 digit PI'))

WebUI.click(findTestObject('Page_Personal Information (1)/input_personalInfoDTO.hasCrimi'))

WebUI.click(findTestObject('Page_Personal Information (1)/input_personalInfoDTO.isUsCiti'))

WebUI.click(findTestObject('Page_Personal Information (1)/div_Female'))

WebUI.click(findTestObject('Page_Personal Information (1)/input_personalInfoDTO.gender'))

WebUI.click(findTestObject('Page_Personal Information (1)/input_personalInfoDTO.ethnicit'))

WebUI.click(findTestObject('Page_Personal Information (1)/input_personalInfoDTO.isUespAc'))

WebUI.click(findTestObject('Page_Personal Information (1)/input_agreeTerms'))

WebUI.click(findTestObject('Page_Personal Information (1)/button_Save  Continue'))

WebUI.click(findTestObject('Page_Education Information (1)/button_ Add School'))

WebUI.selectOptionByValue(findTestObject('Page_Education Information (1)/select_-- Select School--Acade'), '115', true)

WebUI.click(findTestObject('Page_Education Information (1)/button_Save'))

WebUI.selectOptionByValue(findTestObject('Page_Education Information (1)/select_-- Select High School--'), '115', true)

WebUI.click(findTestObject('Page_Education Information (1)/a_13'))

WebUI.selectOptionByValue(findTestObject('Page_Education Information (1)/select_-- Select Grade--9th10t'), '12', true)

WebUI.setText(findTestObject('Page_Education Information (1)/input_stateStudentIdNumber'), 'tdrs061818')

WebUI.setText(findTestObject('Page_Education Information (1)/input_cumulativeGpa'), '3.65')

WebUI.click(findTestObject('Page_Education Information (1)/span_Prev'))

WebUI.click(findTestObject('Page_Education Information (1)/span_Prev'))

WebUI.click(findTestObject('Page_Education Information (1)/span_Prev'))

WebUI.click(findTestObject('Page_Education Information (1)/span_Prev'))

WebUI.click(findTestObject('Page_Education Information (1)/a_26'))

WebUI.setText(findTestObject('Page_Education Information (1)/input_actScores0.score'), '25')

WebUI.setText(findTestObject('Page_Education Information (1)/input_actScores1.score'), '25')

WebUI.setText(findTestObject('Page_Education Information (1)/input_actScores2.score'), '25')

WebUI.setText(findTestObject('Page_Education Information (1)/input_actScores3.score'), '25')

WebUI.setText(findTestObject('Page_Education Information (1)/input_actScores4.score'), '25')

WebUI.click(findTestObject('Page_Education Information (1)/input_agreeTerms'))

WebUI.selectOptionByValue(findTestObject('Page_Education Information (1)/select_-- Select College--Brig'), '2', true)

WebUI.click(findTestObject('Page_Education Information (1)/button_Save Continue'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Add English Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--BYU In'), '7778', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Ninth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '4', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/span_English'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--BYU In'), '7770', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '4', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Add English Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--BYU In'), '7773', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '2', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Add English Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Langua'), '7955', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '2', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/a_Continue to Mathematics'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Add Mathematics Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Algebr'), '7623', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Ninth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '5', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Add Mathematics Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Algebr'), '8004', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '4', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/span_Mathematics'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Algebr'), '7726', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/span_Mathematics'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--BYU In_1'), '7724', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/a_Continue to Social Science'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Add Social Science Cour'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Americ'), '7803', true)

WebUI.click(findTestObject('Page_Course Work (1)/div_--Select Course--American'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Ninth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/span_Social Science'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Americ'), '8086', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '2', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/span_Social Science'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Americ'), '8063', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '2', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/span_Social Science'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Americ'), '8058', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '2', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/a_Continue to Science'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Add Biology Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Biolog'), '7659', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/span_Chemistry'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--BYU In_2'), '7738', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '2', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Add Physics Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--BYU Ph'), '7981', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/a_Continue to World Language'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Add World Language Cour'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Americ_1'), '7807', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/span_World Language'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_--Select Course--Americ_1'), '7810', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select School--Coppe'), '115', true)

WebUI.setText(findTestObject('Page_Course Work (1)/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work (1)/select_-- Select Grade--AA-BBB_3'), '4', true)

WebUI.click(findTestObject('Page_Course Work (1)/button_Save'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Close'))

WebUI.click(findTestObject('Page_Course Work (1)/button_Continue to Review and'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/button_Close'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/input_agreeTerms'))

WebUI.setText(findTestObject('Page_Regents Scholarship Form Revie (1)/input_pinNumber'), '9997')

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/button_Submit'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie (1)/a_Logout'))

WebUI.closeBrowser()

