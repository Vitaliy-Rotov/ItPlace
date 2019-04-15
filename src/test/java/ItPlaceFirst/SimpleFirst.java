package ItPlaceFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFirst {

    private static WebDriver driver;



    public void test1() {

        System.setProperty( "webdriver.chrome.driver", "/Users/vitaliy_rotov/chromedriver" );
        driver = new ChromeDriver();


    }






}
