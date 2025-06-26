package maven_code1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResultPage
{
          WebDriver driver;

	//step-1 Locate component

	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
	   WebElement firstproduct;


	//step-2 Separate method for each component


	public void ClickFirstProduct()
	{
		firstproduct.click();
	}


	//step-3 Initialize element by PageFactory class inside constructor

	public Amazon_SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

}
