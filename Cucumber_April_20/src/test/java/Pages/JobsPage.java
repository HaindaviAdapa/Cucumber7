package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsPage {
	
	
WebDriver driver;

public void passdriver(WebDriver driver1) {
	
	this.driver=driver1;
	PageFactory.initElements(driver1, this);
	
}

@FindBy(xpath="//span[text()='Admin']")
WebElement admin;

@FindBy(xpath="//span[text()='Job ']")
WebElement job;

@FindBy(xpath="//a[text()='Job Titles']")
WebElement jobtitle;

@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
WebElement button;

@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
WebElement jobtitles;

@FindBy(xpath="//textarea[@placeholder='Type description here']")
WebElement jobdesc;

@FindBy(xpath="//textarea[@placeholder='Add note']")
WebElement jobnote;

@FindBy(xpath="//button[@type='submit']")
WebElement submit;


public void NavigateJobs() {
	
	
	admin.click();
	job.click();
	jobtitle.click();
}

public void AddJobs(String JobTitle,String JobDescription,String JobNote) {
	
	button.click();
	jobtitles.sendKeys(JobTitle);
	jobdesc.sendKeys(JobDescription);
	jobnote.sendKeys(JobNote);
	submit.click();
	
	
	
}

}
