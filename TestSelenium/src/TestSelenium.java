import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;


	
public class TestSelenium {
public static void main (String args []) {
		
		
		WebDriver web = new FirefoxDriver();
		web.get("http://store.demoqa.com/");
		String s;
		
		s= web.getTitle();
		System.out.println(s);
		s = web.getCurrentUrl();
		System.out.println(s);

		
		
	web.findElement(By.xpath(".//*[@id='menu-item-33']/a")).click();
	
	web.findElement(By.xpath(".//*[@id='menu-item-39']/a")).click();
	Select Macbookdropdown = new Select( web.findElement(By.xpath(".//*[@id='menu-item-39']/a")));
	Macbookdropdown.selectByIndex(2);
	System.out.println("Macbookdropdown");
	

}
}