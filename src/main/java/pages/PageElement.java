package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElement extends PageBase {

	public PageElement(WebDriver driver) {
		super(driver);
	}

	//All Element
	@FindBy(xpath = "/html/body/header/div[1]/div/div[3]/button")
	WebElement SearchLink;
	@FindBy(id= "txt_search_query")
	WebElement SearchTxt;
	@FindBy(id = "btn_global_search")
	WebElement SearchAgain;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/main/div[3]/ul/li[2]/div/a")
	WebElement SecondLesson;
	@FindBy(className  = "form-control")
	public WebElement CheckSearch;
	@FindBy(xpath = "//*[@id=\"WorksheetSection\"]/div/div[2]")
	WebElement LessonWorksheet;	


	public void ElementAction(String SearchName) {

		SearchLink.click();
		SearchTxt.sendKeys("addition");
		SearchAgain.click();
		SecondLesson.click();
		LessonWorksheet.click();


	} 
}


