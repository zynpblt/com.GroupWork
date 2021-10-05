package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageURL {
    public static void main(String[] args) {
        //Yeni bir class olusturalim : (VerifyURLTest)

        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // techproeducation ana sayfasina gidelim https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");
        //Sayfa URL’inin www. techproeducation.com oldugunu dogrulayin
        String expectedURL="www. techproeducation.com ";
        String actualURL=driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("Test is PASSED");
        }else{
            System.out.println("Test is FAILED");
            System.out.println("actualURL = " + actualURL);
        }
        driver.close();
    }
}
