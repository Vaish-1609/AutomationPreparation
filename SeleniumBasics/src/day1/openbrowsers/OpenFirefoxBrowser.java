package day1.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		//Step1: set path of required driver executable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION SESSION\\WORKSPACE\\SeleniumBasics\\executables\\geckodriver.exe");
		//step2: create instance of required browser class
		FirefoxDriver fdriver=new FirefoxDriver();
	}
}