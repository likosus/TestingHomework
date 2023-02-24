package Test;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class Test2 {


    @Test
    public void test2() {
        driver.get("https://itera-qa.azurewebsites.net/");

        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("//a[@class='nav-link' and @href='/Login']"));
        login.click();


        MyFunc.Bekle(1);
        WebElement userNamelog = driver.findElement(By.xpath("//input[@id='Username']"));
        userNamelog.sendKeys("Likosus");

        MyFunc.Bekle(1);
        WebElement passwordpass = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordpass.sendKeys("12345");
        //input[@id='Username']


        MyFunc.Bekle(2);
        WebElement loginClick = driver.findElement(By.xpath("//input[@name='login']"));
        loginClick.click();


        WebElement successMessage2 = driver.findElement(By.xpath("//h3[contains(text(), 'Welcome')]"));
        String messageText2 = successMessage2.getText();
        if (messageText2.contains("Welcome")) {
            System.out.println("Giriş başarılı bir şekilde yapıldı.");
        } else {
            System.out.println("Giriş yapılırken bir hata oluştu.");
        }

    }

}
