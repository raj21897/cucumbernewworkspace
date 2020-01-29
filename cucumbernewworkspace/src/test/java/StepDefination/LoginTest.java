package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginTest {
	WebDriver driver;
	@Given("^user open TestMeApp$")
	public void useropenTestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\UFT\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("^user click signup$")
	public void userclicksignup() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();	
	}
	@And("^enter usename as \"([^\"]*)\"$")
	public void enterusenameas(String uname) {
		driver.findElement(By.id("userName")).sendKeys(uname);
	}
	@And("^enter firstname as \"([^\"]*)\"$")
	public void enterfirstnameas(String fname) {
	driver.findElement(By.id("firstName")).sendKeys(fname);
	}
	@And("^enter the lastname as \"([^\"]*)\"$")
	public void enterthelastnameas(String lname) {
		driver.findElement(By.id("lastName")).sendKeys(lname);
	}
	@And("^enter the password as \"([^\"]*)\"$")
	public void enterthepasswordas(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@And("^enter the confirm password as \"([^\"]*)\"$")
	public void entertheconfirmpasswordas(String cpass) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(cpass);
	}
	@And("^enter gender as \"([^\"]*)\"$")
	public void entergenderas(String gender) {
		if (gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		}else if(gender.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath("//input[@value='Female']")).click();
		}
	}
	@And("^enter email as \"([^\"]*)\"$")
	public void enteremailas(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}
	@And("enter mobile number as \"([^\"]*)\"$")
	public void entermobilenumberas(String mob) {
		driver.findElement(By.id("mobileNumber")).sendKeys(mob);
	}
	@And("^enter dob as \"([^\"]*)\"$")
	public void enterdobas(String dob) {
		driver.findElement(By.id("dob")).sendKeys(dob);
	}
	@And("^enter address as \"([^\"]*)\"$")
	public void enteraddressas(String add) {
		driver.findElement(By.id("address")).sendKeys(add);
	}
	@And("^enter answer as \"([^\"]*)\"$")
	public void enteransweras(String ans) {
		driver.findElement(By.id("answer")).sendKeys(ans);
	}
	@Then("^user click on register$")
	public void userclickonregister() {
		driver.findElement(By.name("Submit")).click();
	}
	// second testcase
   @When("^user click click signin$")
   public void userclickclicksignin() {
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
   }
   @And("^user enter credentials as$")
   public void userentercredentialsas(DataTable dt) {
	   List<String> cred=dt.asList(String.class);
	   driver.findElement(By.name("userName")).sendKeys(cred.get(0));
	   driver.findElement(By.name("password")).sendKeys(cred.get(1));
	   driver.findElement(By.name("Login")).click();
	   
   }
   @And("^search product$")
   public void searchproduct(DataTable ct) {
	   List<String> cart=ct.asList(String.class);
	   driver.findElement(By.id("myInput")).sendKeys(cart.get(0));
	   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
   }
   @Then("^click on add to cart button$")
   public void clickonaddtocartbutton(){
	   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	   
   }
}
