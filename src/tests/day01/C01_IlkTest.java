package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println("su andaki URL = " + driver.getCurrentUrl());
        System.out.println("su andaki baslik = " + driver.getTitle());
        driver.manage().window().maximize();

        driver.navigate().to("https://www.techproeducation.com");
        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();

        driver.close();


    }
}
