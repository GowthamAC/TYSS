package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {

	public static void main(String[] args) {
		String s = "ertygwqhgegffe/5667/1626hhjhhhbhjwhb";
		char[] ch = s.toCharArray();
	for (int i = 1; i <ch.length; i++) {
		
		if (ch[i]>='0' && ch[i]<='9') {
			
			if (ch[i-1]=='/') {
			
			System.out.println(ch[i]);
			
		}
		}
	}
	
	}

}
