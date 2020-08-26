import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.LinkedList;

public class Test1 {

    public static void main(String[] args) {
        LinkedList<String> liste = new LinkedList<String>();

        System.setProperty("webdriver.gecko.driver", "/home/sam/IdeaProjects/geckodriver");
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("https://de.finance.yahoo.com/quote/IS3R.DE?p=IS3R.DE&.tsrc=fin-srch&guccounter=1");
        webDriver.findElement(By.xpath("//button[@name='agree']")).click(); // Popup für Coockies schließen
        webDriver.findElement(By.xpath("//a[contains(text(),'here')]")).click(); // Popup für Coockies schließen
        WebElement kursstand = webDriver.findElement(By.xpath("//span[@class='Trsdu(0.3s) Fw(b) Fz(36px) Mb(-4px) D(ib)']"));
        liste.add("Momentum: " + kursstand.getText());


        webDriver.get("https://de.finance.yahoo.com/quote/IS3Q.DE?p=IS3Q.DE&.tsrc=fin-srch");
        kursstand = webDriver.findElement(By.xpath("//span[@class='Trsdu(0.3s) Fw(b) Fz(36px) Mb(-4px) D(ib)']"));
        liste.add("Quality: " + kursstand.getText());
        webDriver.findElement(By.xpath("//button[@name='agree']")).click(); // Popup für Coockies schließen


        /*webDriver.get("https://de.finance.yahoo.com/quote/IS3N.DE?p=IS3N.DE&.tsrc=fin-srch");
        webDriver.get("https://de.finance.yahoo.com/quote/IS3S.DE?p=IS3S.DE&.tsrc=fin-srch");
        webDriver.get("https://de.finance.yahoo.com/quote/IUSN.DE?p=IUSN.DE&.tsrc=fin-srch");*/

        System.out.println(liste.toString());
        webDriver.close();


        //span[@class='Trsdu(0.3s) Fw(b) Fz(36px) Mb(-4px) D(ib)']
    }

}
