package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NationalityPage {
	
	WebDriver driver;

public void passdriver(WebDriver driver1) {
	
	this.driver=driver1;
	PageFactory.initElements(driver1,this);
}

@FindBy(xpath="//span[text()='Admin']")
WebElement admin;

@FindBy(xpath="//a[text()='Nationalities']")
WebElement nationalities;

@FindBy(xpath="(//button[@type='button'])[2]")
WebElement Addbutton;

@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
WebElement nationalitytext;

@FindBy(xpath="//button[@type='submit']")
WebElement submit;




public void NavigateNationalityPage() {
	
	
	admin.click();
	nationalities.click();
	
	
}
public void AddNationality(String Nationalitytext) {
	
	
	Addbutton.click();
	nationalitytext.sendKeys(Nationalitytext);
	submit.click();
	
	
	
}
}

