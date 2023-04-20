package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	
	
	WebDriver driver;

public void passdriver(WebDriver driver1) {
	
	this.driver=driver1;
	PageFactory.initElements(driver1, this);
}




@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[1]")
WebElement Admin;

@FindBy(xpath="//span[text()='Qualifications ']")
WebElement qualifi;

@FindBy(xpath="//a[text()='Skills']")
WebElement skills;

@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
WebElement Addbutton;

@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
WebElement skillname;

@FindBy(xpath="//textarea[ @placeholder='Type description here']")
WebElement skilldesc;

@FindBy(xpath="//button[text()=' Save ']")
WebElement Save;




public void NavigateSkills() {
	
	Admin.click();
	qualifi.click();
	skills.click();
	
	
}	

public void AddSkills(String SkillName,String SkillDescription) {
	
	Addbutton.click();
	skillname.sendKeys(SkillName);
	skilldesc.sendKeys(SkillDescription);
	Save.click();
	
	
	
	
}
}
