package Test;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class Test1 extends BaseDriver {
 @Test
 public void test1() {


     driver.get("https://itera-qa.azurewebsites.net/");

     MyFunc.Bekle(1);
     WebElement signUp = driver.findElement(By.xpath("//a[@class='nav-link' and @href='/UserRegister/NewUser']"));
     signUp.click();

     MyFunc.Bekle(1);
     WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
     firstName.sendKeys("Mustafa");

     MyFunc.Bekle(1);
     WebElement surname = driver.findElement(By.xpath("//input[@id='Surname']"));
     surname.sendKeys("likos");

     MyFunc.Bekle(1);
     WebElement epost = driver.findElement(By.xpath("//input[@id='E_post']"));
     epost.sendKeys("likosmustafa@gmail.com");

     MyFunc.Bekle(1);
     WebElement mobile = driver.findElement(By.xpath("//input[@id='Mobile']"));
     mobile.sendKeys("545354546");

     MyFunc.Bekle(1);
     WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
     userName.sendKeys("Likosus");

     MyFunc.Bekle(1);
     WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
     password.sendKeys("12345");

     MyFunc.Bekle(1);
     WebElement confirmPassport = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
     confirmPassport.sendKeys("12345");

     MyFunc.Bekle(2);
     WebElement Submit = driver.findElement(By.xpath("//input[@id='submit']"));
     Submit.click();

     WebElement successMessage = driver.findElement(By.xpath("//label[@class='label-success']"));
     String messageText = successMessage.getText();
     if (messageText.contains("Registration Successful")) {
         System.out.println("Kayıt başarıyla oluşturuldu.");
     } else {
         System.out.println("Kayıt oluşturulurken bir hata oluştu.");
     }
 }

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

   @Test
           public void test3(){

    MyFunc.Bekle(1);
    WebElement createNew= driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
    createNew.click();


    MyFunc.Bekle(1);
    WebElement customerName= driver.findElement(By.xpath("//input[@id='Name']"));
    customerName.sendKeys("ceyda");

    MyFunc.Bekle(1);
    WebElement companyName= driver.findElement(By.xpath("//input[@id='Company']"));
    companyName.sendKeys("Ribos.LTD");

    MyFunc.Bekle(1);
    WebElement CompanyAdress= driver.findElement(By.xpath("//input[@id='Address']"));
    CompanyAdress.sendKeys("Ribos.LTD");

    MyFunc.Bekle(1);
    WebElement City= driver.findElement(By.xpath("//input[@id='City']"));
    City.sendKeys("Amsterdam");

    MyFunc.Bekle(1);
    WebElement companyPhone= driver.findElement(By.xpath("//input[@id='Phone']"));
    companyPhone.sendKeys("1111111");

    MyFunc.Bekle(1);
    WebElement companyAddress= driver.findElement(By.xpath("//input[@id='Email']"));
    companyAddress.sendKeys("ribos@gmail.com");


    MyFunc.Bekle(1);
    WebElement createButtom=driver.findElement(By.xpath("//input[@type='submit']"));
    createButtom.click();





    BekleKapat();

    }


}


