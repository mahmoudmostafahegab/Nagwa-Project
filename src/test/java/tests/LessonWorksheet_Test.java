package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.PageElement;

public class LessonWorksheet_Test extends TestBase{

	PageElement ElementObject;

	@Test
	public void LessonWorksheetTestCase() throws Exception {
		String SearchName = "";

		ElementObject = new PageElement(driver);
		ElementObject.ElementAction(SearchName);
		Thread.sleep(2000);
		//list with all lessons in Nagwa that match this name will appear.
		Assert.assertEquals(ElementObject.CheckSearch.getText(),SearchName);
		//count number of questions displayed 
		int Count =driver.findElements(By.className("instance")).size();
		System.out.println("Number of questions :"+Count);
	}

}
