import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		//System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\jadhavm01\\Downloads\\chrome-win64\\chrome-win64\\setup.exe")
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.udemy.com/");
		System.out.println(Driver.getTitle());
		Driver.close();
		Driver.quit();
		
	}

}
