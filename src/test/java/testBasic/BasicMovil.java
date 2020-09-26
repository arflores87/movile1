package testBasic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class BasicMovil {

    private  AppiumDriver driver;

    @Before
    public void before() throws MalformedURLException {
        System.out.println("Iniciando Conexion.....");

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","EynarH");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.android.calculator2");
        capabilities.setCapability("appActivity",".Calculator");
        capabilities.setCapability("platformName","Android");

        this.driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @Test
    public void myfirstTest(){

       //  Action + Cual elemento? + En Donde esta el Elemento
       //  Click on [Login] Button in Login Page

        // press 2
        this.driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        // press +
        this.driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        // press 5
        this.driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
        // press =
        this.driver.findElement(By.id("com.android.calculator2:id/eq")).click();

        // verificacion  7
        String actualResult=this.driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
        String expectedResult="8";

        Assert.assertEquals("ERROR ! La suma es incorrecta",expectedResult,actualResult);

    }

    @After
    public void after(){
        System.out.println("AFTER.....");
        this.driver.quit();
    }

}
