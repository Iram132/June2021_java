package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class SetColorPage extends BasePage {
	String skyblue;
	WebDriver driver;

	public SetColorPage(WebDriver driver) {
	this.driver = driver;
	}
	
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']") WebElement SKYBLUE_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']") WebElement WHITE_BUTTON_ELEMENT;

	@FindBy(how = How.CSS, using = "body[style=\"background-color: skyblue;\"]")WebElement SKYBLUE_COLOR_ELEMENT;
	@FindBy(how = How.CSS, using = "body[style='background-color: white;']")WebElement WHITE_COLOR_ELEMENT;

	 
	public void clickOnSkyBlueButton() {
			SKYBLUE_BUTTON_ELEMENT.click();
		}

	public void assertSkyBlueColor() {
		String SkyBlueBackGround = SKYBLUE_COLOR_ELEMENT.getCssValue("background-color");
		String hexBlue = Color.fromString(SkyBlueBackGround).asHex();
		System.out.println("Hex Code for color is " + hexBlue);
	}

	public void clickOnWhiteButton() {
		WHITE_BUTTON_ELEMENT.click();
	}

	public void assertWhiteColor() {
			String WhiteBackGround = WHITE_COLOR_ELEMENT.getCssValue("background-color");
			String hexWhite = Color.fromString(WhiteBackGround).asHex();
			System.out.println("Hex code for color is " + hexWhite);
		}

}


