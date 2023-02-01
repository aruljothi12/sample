package com.lao.javalearning;

public class Facebook extends Baseclass{
	
	public static void main(String[] args) {
		
		Facebook fb = new Facebook();
	
		fb.browserConfigChrome();
		fb.openUrl("http://www.facebook.com");
		
		fb.maximizewindow();
		
		WebElement txtEmail = fb.locateById("email");
		
	}

}
