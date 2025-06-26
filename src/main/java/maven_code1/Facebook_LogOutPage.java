package maven_code1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LogOutPage
{
	WebDriver driver;
	// step- 1 - Locate each component using @FindBy Annotation

	     @FindBy(xpath="(//span[@class='html-span xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1hl2dhg x16tdsg8 x1vvkbs x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j'])[9]")
	       WebElement profileclick;     // this wrong  need to make it correct

	     @FindBy(xpath="(//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x2lah0s x193iq5w xurb0ha x1sxyh0'])[5]")
	       WebElement logoutbutton;


	// step- 2 - Create separate methods for each component to perform action

	     public void profile()
	     {
	    	 profileclick.click();
	     }

	     public void logout()
	     {
	    	 logoutbutton.click();
	     }


   // step- 3 - Initializing the elements using PageFactory class inside the constructor

	     public Facebook_LogOutPage(WebDriver driver)
	     {
	    	 //this.driver=driver;
	    	 PageFactory.initElements(driver, this);

	     }

}
