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

WebUI.click(findTestObject('Page_Login - Regents Scholarship/input_signUpId'))

WebUI.click(findTestObject('Page_Login - Regents Scholarship/button_Close'))

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_username'), 'tdrs061818c')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_password'), 'Welcome01')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_confirm_password'), 'Welcome01')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_firstName'), 'tdrs061818')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_lastName'), 'tdrs061818')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_emailAddress'), 'tdrs061818c@hkconsulting.biz')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_confirm_email'), 'tdrs061818c@hkconsulting.biz')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_phoneNumber'), '(505) 555-0006')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_addressLine1'), '11342 South 3275 West')

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_city'), 'South Jordan')

WebUI.selectOptionByValue(findTestObject('Page_Login - Regents Scholarship/select_--Select State--Alabama'), 'Utah', true)

WebUI.setText(findTestObject('Page_Login - Regents Scholarship/input_postalCode'), '84095')

WebUI.click(findTestObject('Page_Login - Regents Scholarship/input_academicYear'))

WebUI.selectOptionByValue(findTestObject('Page_Login - Regents Scholarship/select_--Select Referral Sourc'), '1', true)

WebUI.click(findTestObject('Page_Login - Regents Scholarship/input_startYourApplicationId'))

WebUI.click(findTestObject('Page_Home  Regents Scholarship/button_Continue'))

WebUI.click(findTestObject('Page_Personal Information/button_Close'))

WebUI.click(findTestObject('Page_Personal Information/input_notifyOption'))

WebUI.click(findTestObject('Page_Personal Information/a_1'))

WebUI.click(findTestObject('Page_Personal Information/div_Social Security Number'))

WebUI.setText(findTestObject('Page_Personal Information/input_personalInfoDTO.ssn'), '999-99-9997')

WebUI.click(findTestObject('Page_Personal Information/p_Please create a 4 digit PIN.'))

WebUI.setText(findTestObject('Page_Personal Information/input_pinNumber'), '9997')

WebUI.click(findTestObject('Page_Personal Information/div_How would you like to be n'))

WebUI.click(findTestObject('Page_Personal Information/input_personalInfoDTO.hasCrimi'))

WebUI.click(findTestObject('Page_Personal Information/input_personalInfoDTO.isUsCiti'))

WebUI.click(findTestObject('Page_Personal Information/input_personalInfoDTO.gender'))

WebUI.click(findTestObject('Page_Personal Information/input_personalInfoDTO.ethnicit'))

WebUI.click(findTestObject('Page_Personal Information/input_agreeTerms'))

WebUI.click(findTestObject('Page_Personal Information/input_personalInfoDTO.isUespAc'))

WebUI.click(findTestObject('Page_Personal Information/button_Save  Continue'))

WebUI.click(findTestObject('Page_Education Information/button_ Add School'))

WebUI.selectOptionByValue(findTestObject('Page_Education Information/select_-- Select School--Acade'), '33', true)

WebUI.click(findTestObject('Page_Education Information/button_Save'))

WebUI.selectOptionByValue(findTestObject('Page_Education Information/select_-- Select High School--'), '33', true)

WebUI.click(findTestObject('Page_Education Information/a_14'))

WebUI.selectOptionByValue(findTestObject('Page_Education Information/select_-- Select Grade--9th10t'), '12', true)

WebUI.setText(findTestObject('Page_Education Information/input_stateStudentIdNumber'), 'tdrs061818')

WebUI.setText(findTestObject('Page_Education Information/input_cumulativeGpa'), '3.5')

WebUI.click(findTestObject('Page_Education Information/a_3'))

WebUI.setText(findTestObject('Page_Education Information/input_actScores0.score'), '22')

WebUI.setText(findTestObject('Page_Education Information/input_actScores1.score'), '22')

WebUI.setText(findTestObject('Page_Education Information/input_actScores2.score'), '22')

WebUI.setText(findTestObject('Page_Education Information/input_actScores3.score'), '22')

WebUI.setText(findTestObject('Page_Education Information/input_actScores4.score'), '22')

WebUI.click(findTestObject('Page_Education Information/div_College'))

WebUI.click(findTestObject('Page_Education Information/input_agreeTerms'))

WebUI.selectOptionByValue(findTestObject('Page_Education Information/select_-- Select College--Brig'), '10', true)

WebUI.click(findTestObject('Page_Education Information/button_Save Continue'))

WebUI.click(findTestObject('Page_Course Work/div_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Add English Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--BYU In'), '7778', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Ninth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Add English Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--BYU In'), '7770', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Add English Course'))

WebUI.click(findTestObject('Page_Course Work/div_Class Subject  EnglishClas'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--BYU In'), '7773', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Add English Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--BYU In'), '7775', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/a_Continue to Mathematics'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/span_Mathematics'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Algebr'), '7623', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Ninth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Add Mathematics Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Algebr'), '8004', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/span_Mathematics'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Algebr'), '7726', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/div_Pre Calculus H'))

WebUI.doubleClick(findTestObject('Page_Course Work/div_Pre Calculus H'))

WebUI.click(findTestObject('Page_Course Work/span_Mathematics'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--BYU In_1'), '7967', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select College--Brig'), '3', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '3.00')

WebUI.setText(findTestObject('Page_Course Work/input_collegeCredits'), '9.00')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/a_Continue to Social Science'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Add Social Science Cour'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Americ'), '7803', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Ninth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Add Social Science Cour'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Americ'), '8082', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Add Social Science Cour'))

WebUI.click(findTestObject('Page_Course Work/div_-- Select Class Type--Stan'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Americ'), '8063', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/span_Social Science'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Americ'), '8058', true)

WebUI.click(findTestObject('Page_Course Work/div_-- Select School--Alta Hig'))

WebUI.click(findTestObject('Page_Course Work/div_col-sm-6 row'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/a_Continue to Science'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/div_ScienceAdd Biology Course'))

WebUI.click(findTestObject('Page_Course Work/button_Add Biology Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Biolog'), '7660', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Ninth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/span_Chemistry'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--BYU In_2'), '7738', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '2', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/div_ScienceAdd Physics Course'))

WebUI.click(findTestObject('Page_Course Work/button_Add Physics Course'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--BYU Ph'), '7993', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '4', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/a_Continue to World Language'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/span_World Language'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Americ_1'), '7807', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Eleventh', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '3', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Add World Language Cour'))

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Class Type--S'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_--Select Course--Americ_1'), '7810', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select School--Alta'), '33', true)

WebUI.setText(findTestObject('Page_Course Work/input_highSchoolCredits'), '1.0')

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Tenth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade Level--'), 'Twelfth', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_1'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_2'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Course Work/select_-- Select Grade--AA-BBB_3'), '2', true)

WebUI.click(findTestObject('Page_Course Work/button_Save'))

WebUI.click(findTestObject('Page_Course Work/button_Close'))

WebUI.click(findTestObject('Page_Course Work/button_Continue to Review and'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/button_Close'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/input_agreeTerms'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/div_Submit'))

WebUI.setText(findTestObject('Page_Regents Scholarship Form Revie/input_pinNumber'), '9997')

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/button_Submit'))

WebUI.click(findTestObject('Page_Regents Scholarship Form Revie/a_Logout'))

WebUI.closeBrowser()

