package day1.openbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerAutomation {

	public static void main(String[] args) {
		//open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION SESSION\\WORKSPACE\\SeleniumBasics.\\executables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//validate login page
		String expectedTitle="vtiger";
		String actualTitle=driver.getTitle();
		//maximize browser window
		driver.manage().window().maximize();
		//WebElement usernameInputField=driver.findElement(By.id("user-name"));
		//usernameInputField.sendKeys("standard_user");
		//validate username fields-visible, editable, default
		WebElement usernameInputField=driver.findElement(By.id("username"));
		System.out.println("is username field visible? "+usernameInputField.isDisplayed());
		System.out.println("is username field editable? "+usernameInputField.isEnabled());
		System.out.println("default value of username field: "+usernameInputField.getAttribute("placeholder"));
		//validate password fields-visible, editable, default
		WebElement passwordInputField=driver.findElement(By.id("password"));
		System.out.println("is password field visible? "+passwordInputField.isDisplayed());
		System.out.println("is password field editable? "+passwordInputField.isEnabled());
		System.out.println("default value of password field: "+passwordInputField.getAttribute("placeholder"));
		//validate sign in button
		WebElement signIn=driver.findElement(By.className("button"));
		System.out.println("is button visible? "+signIn.isDisplayed());
		System.out.println("is submit button clickable? "+signIn.isEnabled());
		signIn.click();
		driver.findElement(By.className("button")).sendKeys("Sign_In");
		//remove existing text from username field and type username as admin
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");
		//remove existing text from password field and type password as Test@123
		passwordInputField.clear();
		passwordInputField.sendKeys("Test@123");
		//click on SignIn button validate home page - title/url click on profile
		String pageTitle=driver.getTitle();
	}
}

