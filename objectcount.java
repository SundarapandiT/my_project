import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class objectCount {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ravip\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com/mail/help");
        System.out.println("Total number of objects on the page: " + driver.findElements(By.tagName("p")).size());
        driver.quit();
    }
}
