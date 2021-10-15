
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author mahmoud Mostafa 
 *
 */
public class PageBase {

	protected WebDriver driver;

	//create constructor

	public PageBase(WebDriver driver) {


		PageFactory.initElements(driver, this);


	}


}
