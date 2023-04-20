package GlueCode;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.JobsPage;
import Pages.LoginPage;
import Pages.NationalityPage;
import Pages.SkillsPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver;

   @After(value="@Smoke",order=2)
   public void Test1() {
	   
	    System.out.println("This is after senario");
   }
   @After(value="@Smoke",order=1)
   public void Test2() {
	   
	   System.out.println("This is after after senario");

   }
   @AfterStep(value="@Sanity")
   public void Test3() {
	   
	   System.out.println("This is after  step");
	   
   }
   @AfterStep(value="@Smoke")
   public void Test4() {
	   
	   System.out.println("This is after after step");
	   
   }
   @BeforeStep(value="@Sanity")
   public void Test5() {
	   
	   System.out.println("This is before step");
	   
   }
   @Before(value="@Smoke and @Sanity")
   public void Test6() {
	   
	    System.out.println("This is after senario");
   }

	@Given("User opens chrome browser")
	public void user_opens_chrome_browser() {
	    
	System.setProperty("webdriver.chrome.driver","c://chromedriver_win32//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	}
	@When("User opens application URL{string}")
	public void user_opens_application_url_https_opensource_demo_orangehrmlive_com_web_index_php_auth_login(String TestURL) {
	    
	driver.get(TestURL);
	
	
	}
	@Given("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
	    
		LoginPage L1= new LoginPage();
		L1.passdriver(driver);
		L1.Login(username, password);
	
	
	}
	@When("User navigates to Jobs page")
	public void user_navigates_to_jobs_page() {
	    
		JobsPage J1= new JobsPage();
		J1.passdriver(driver);
		J1.NavigateJobs();
	
	
	
	}
	@Then("User creats Jobs record as")
	public void user_creats_jobs_record_as(io.cucumber.datatable.DataTable dataTable) {
	    
	List<Map<String,String>>JobsData=dataTable.asMaps(String.class,String.class);
	
	System.out.println("Number of rows:"+JobsData.size());
	
	for(int i=0;i<JobsData.size();i++) {
		
	System.out.println(JobsData.get(i).get("JobTitle"));
	
	System.out.println(JobsData.get(i).get("JobDescription"));
	
	System.out.println(JobsData.get(i).get("JobNote"));
	
	String JobTitle=JobsData.get(i).get("JobTitle");	
	
	String JobDescription=JobsData.get(i).get("JobDescription");
	
	String JobNote=JobsData.get(i).get("JobNote");
		
	System.out.println("_______________");{
		
		JobsPage J2= new 	JobsPage();
		J2.passdriver(driver);
		J2.AddJobs(JobTitle,JobDescription,JobNote);
		
		
	}
	}
	
	
	}
	@When("User navigates to Skills page")
	public void user_navigates_to_skills_page() {
	    
		SkillsPage S1= new SkillsPage();
		S1.passdriver(driver);
		S1.NavigateSkills();
	
	
	
	}
	@Then("User creats Skills record as")
	public void user_creats_skills_record_as(io.cucumber.datatable.DataTable dataTable) {
	   
	List<List<String>>SkillsData=dataTable.cells();
	
	System.out.println("Number of rows:"+SkillsData.size());
	
	for(int i=0;i<SkillsData.size();i++) {
		
	System.out.println(SkillsData.get(i).get(0));
	
	String SkillName=SkillsData.get(i).get(0);
	
	String SkillDescription=SkillsData.get(i).get(1);
	
	System.out.println("______________________");{
		
		SkillsPage S2= new 	SkillsPage();
		S2.passdriver(driver);
		S2.AddSkills(SkillName,SkillDescription);
	}
		
	}
	
	
	}
	@When("User navigates to Nationality page")
	public void user_navigates_to_nationality_page() {
		
		
		NationalityPage N1= new NationalityPage();
		N1.passdriver(driver);
		N1.NavigateNationalityPage();
		
		
	}
	@Then("User creats Nationality record enters Nationality Text as {string}")
	public void user_creats_nationality_record_enters_nationality_text_as(String Nationalitytext) {
	    
        NationalityPage N2= new NationalityPage();
		N2.passdriver(driver);
		N2.AddNationality(Nationalitytext);
	
	}
    @When("User logout")
	public void user_logout() {
	   
    	HomePage H1= new HomePage();
    	H1.passdriver(driver);
        H1.Logout();
    }
	@When("Close browser")
	public void close_browser() {
	   
	driver.close();
	
	
	}
}




