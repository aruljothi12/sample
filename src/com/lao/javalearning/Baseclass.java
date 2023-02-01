package com.lao.javalearning;

public class Baseclass {
	
	WebDriver driver;
	public void browserConfigChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver=new Chromedriver();
	}
	
	public void openUrl(String url) {
		
		driver.get(url);	
	}
	
	public void maximizewindow() {
		driver.manage().window().maximize();
	}
	
	public  WebElement locateById(String id) {
		
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
		
	}
	
	public WebElement locateByName(String name) {
		
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
		
	}
	
	public WebElement locateByXpath(String xpath) {
		
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}
	

}
