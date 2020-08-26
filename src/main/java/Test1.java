import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/home/sam/IdeaProjects/geckodriver");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://github.com/");

    }

}
