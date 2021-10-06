package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Odev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //    1. Yeni bir class olusturalim (Homework)
//    2. ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
//oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://en-gb.facebook.com/");
        String expectedTitle="facebook";
        String actualTitle= driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Facebook title is correct");
        }else{
            System.out.println("facebook title is notcorrect");
            System.out.println("actualTitle = " + actualTitle);
        }
//    3. Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
//yazdirin.
        String expectedUrl="facebook";
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("FacebookUrl is Pass contains");
        }else{
            System.out.println("Facebook is Failed  not exist icermez");
            System.out.println("actualTitle = " + actualTitle);
        }

//    4. https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");
//    5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedwalmartTitle="Walmart.com";
        String actualwalmartTitle= driver.getTitle();
        if (actualwalmartTitle.contains(expectedwalmartTitle)){
            System.out.println("Test is pass walmarttitle dogru");
        }else{
            System.out.println("test is failed walmarttitle yanlis");
            System.out.println("actualwalmartTitle = " + actualwalmartTitle);
        }
//    6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
//    7. Sayfayi yenileyin
        driver.navigate().refresh();
//    8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
//    9. Browser’i kapatin
        driver.close();
    }
}
