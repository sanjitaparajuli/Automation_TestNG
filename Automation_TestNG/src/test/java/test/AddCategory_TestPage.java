package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.AddCategory_Page;
import util.BrowserFactory;

public class AddCategory_TestPage {

	WebDriver driver;
	

	
	@Test
	public void AddCategory() throws InterruptedException {

		driver = BrowserFactory.initDriver();
		AddCategory_Page AddCategory_PageObj = PageFactory.initElements(driver, AddCategory_Page.class);
		
		AddCategory_PageObj.enterValueInAddElement("Pragya Paudel");
		AddCategory_PageObj.selectCategoryDropdownElement("ppaudel5435");
		AddCategory_PageObj.selectDueDateDayDropDownElement("31");
		AddCategory_PageObj.selectDueDateMonthDropDownElement("Aug");
//		AddCategory_PageObj.selectAddCategoryDropDownElement("Pragya Paudel1");
		AddCategory_PageObj.selectColorDropDownElement("None");
		Thread.sleep(4000);
		AddCategory_PageObj.clickAddCategoryButton();
	
	}
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//		driver.quit();
	}

//}
