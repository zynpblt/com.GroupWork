package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Odev {
    public static void main(String[] args) {
        //1. Yeni bir class olusturun (TekrarTesti)
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fzayd\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //2. youtube web sayfasına gidin ve sayfa başlığının “youtube ” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");

        String expectedYoutubeTitle="youtube";
        String actualYoutubeTitle= driver.getTitle();

        if (expectedYoutubeTitle.equals(actualYoutubeTitle)){
            System.out.println("Test is PASSED");
        }else{
            System.out.println("Test is FAILED");
            System.out.println("actualYoutubeTitle = " + actualYoutubeTitle);
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        String expectedYoutubeURL="youtube";
        String actualYoutubeURL= driver.getCurrentUrl();

        if (actualYoutubeURL.contains(expectedYoutubeURL)){
            System.out.println("Test is PASSED");
        }else{
            System.out.println("Tst is FAILED");
            System.out.println("actualYoutubeURL = " + actualYoutubeURL);
        }


        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. RefrSayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.

        String expectedAmazonTitle="Amazon";
        String actualAmazonTitle= driver.getTitle();
        if (actualAmazonTitle.contains(expectedAmazonTitle)){
            System.out.println("Amazon Pass");
        }else{
            System.out.println("Amazon Fail");
            System.out.println("actualAmazonTitle = " + actualAmazonTitle);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru

        String expectedAmazonURL="https://www.amazon.com/";
        String actualAmazonURL= driver.getCurrentUrl();
        if (actualAmazonURL.equals(expectedAmazonURL)){
            System.out.println("Amazon URL Pass");
        }else{
            System.out.println("Amazon URL Fail");
            System.out.println("actualAmazonURL = " + actualAmazonURL);
        }
        //URL'yi yazdırın
        //11.Sayfayi kapatin
        driver.close();

    }
}
