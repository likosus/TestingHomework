package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

    static // class dan sonra ilk kullanıcak ise sasdece statik yetecek.****
    {
        KalanOncekileriKapat();

        Logger logger=Logger.getLogger("");// sisteme ait bütün logları üreten
        // objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // sadece errorları göster


        //outputtaki gerekmeyen logları cıkaracagız.

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        driver=new ChromeDriver();

        driver.manage().window().maximize();// ekrani tam ekran moduna getiriyor.

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        // sadece tüm sayfanin bilgisayariniza inmesi süresiyle ilgilenmezse
        //Selenuım sayfa yüklenene kadar sonsunza kadar bekler.
        //30 sn süresince sayfanın yüklemesini bekle yüklemezse hata ver.
        //eğer 2 sn yükselerse 30 sanite beklenez.

        driver.manage().timeouts().implicitlyWait(dr);
        // bütün webelementlerin element bazında,element özel işlem yapılmadan once
        //hazir hale gelmesi verilen muhlet yani süre.//eger iki saniye yüklerse
        //30.sn beklemez




    }
    public static void BekleKapat()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }
    public static void KalanOncekileriKapat()
    {
        try
        {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        }   catch (Exception ignored)
        {

        }
    }
}






