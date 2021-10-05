package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {
    public static void main(String[] args) {
        // Yeni bir Class olusturalim. (VerifyTitle)
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //        Amazon ana sayfasina gidelim . https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)
        String expectedTitle="amazon";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test is PASSED");
        }else{
            System.out.println("Test is FAILED");
            System.out.println("actualTitle = " + actualTitle);
        }
        driver.close();

    }
}
