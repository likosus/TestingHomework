package Test;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class Test3 {

    @Test
    public void test3() {

        MyFunc.Bekle(1);
        WebElement createNew = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        createNew.click();


        MyFunc.Bekle(1);
        WebElement customerName = driver.findElement(By.xpath("//input[@id='Name']"));
        customerName.sendKeys("ceyda");

        MyFunc.Bekle(1);
        WebElement companyName = driver.findElement(By.xpath("//input[@id='Company']"));
        companyName.sendKeys("Ribos.LTD");

        MyFunc.Bekle(1);
        WebElement CompanyAdress = driver.findElement(By.xpath("//input[@id='Address']"));
        CompanyAdress.sendKeys("Ribos.LTD");

        MyFunc.Bekle(1);
        WebElement City = driver.findElement(By.xpath("//input[@id='City']"));
        City.sendKeys("Amsterdam");

        MyFunc.Bekle(1);
        WebElement companyPhone = driver.findElement(By.xpath("//input[@id='Phone']"));
        companyPhone.sendKeys("1111111");

        MyFunc.Bekle(1);
        WebElement companyAddress = driver.findElement(By.xpath("//input[@id='Email']"));
        companyAddress.sendKeys("ribos@gmail.com");


        MyFunc.Bekle(1);
        WebElement createButtom = driver.findElement(By.xpath("//input[@type='submit']"));
        createButtom.click();


    }

    }
