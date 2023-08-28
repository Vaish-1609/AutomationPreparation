package day1.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\AUTOMATION SESSION\\WORKSPACE\\SeleniumBasics.\\executables\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("http://www.flipkart.com");
		//cdriver.getTitle();
		System.out.println(cdriver.getTitle());
		
	}
	

}

