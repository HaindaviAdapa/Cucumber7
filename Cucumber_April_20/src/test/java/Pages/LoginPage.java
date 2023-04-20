package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
public void passdriver(WebDriver driver1) {

       this.driver=driver1;
       PageFactory.initElements(driver1, this);
}

@FindBy(xpath="//input[@name='username']")
WebElement UserName;

@FindBy(xpath="//input[@name='password']")
WebElement Pasword;

@FindBy(xpath="//button[@type='submit']")
WebElement Submit;




public void Login(String username,String password) {
	
	UserName.sendKeys(username);
	Pasword.sendKeys(password);
	Submit.click();
	
	
}	
	
}


