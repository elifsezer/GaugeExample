package com.example.test;

import com.sun.xml.internal.bind.v2.model.core.ElementInfo;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class StepImplementation extends BaseTest {


    @Step("<key> saniye bekle")
    public void waitWitSecond(int key) throws InterruptedException {
        //wait methodu yazıldı
        Gauge.captureScreenshot(); //screenshot alıyor.
        Gauge.writeMessage("element tıklandı");
        Thread.sleep(key * 1000);
    }

    @Step("<key> elemente tıkla")
    public void clickElementByCss(String key) {
       Gauge.captureScreenshot(); //screenshot alıyor.
        Gauge.writeMessage("key tıklandı");
        driver.findElement(By.cssSelector(key)).click();

    }

    @Step("<key> elementi bul ve <text> değerini yaz")
    public void SendKeyByCss(String element, String key) {
        Gauge.captureScreenshot(); //screenshot alıyor.
        Gauge.writeMessage("key tıklandı");
        driver.findElement(By.cssSelector(element)).sendKeys(key);
    }
}
