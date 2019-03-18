package com.shtohryn;

import com.shtohryn.shtohryn.dataProvider.CsvDataReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GmailLoginTest extends BaseTest {
    @BeforeEach
    public void setUp() throws Exception {
        initialSettingsTesr();
    }

    @AfterEach
    public void downownTest() throws IOException {
        closeSession();
    }

    @Test
    public void loginTest() throws IOException, InterruptedException {
        appiumDriver.findElement(By.id("identifierId")).sendKeys("tom.shtogryn.2004");
        appiumDriver.findElement(By.id("identifierNext")).click();
       appiumDriver.findElement(By.id("identifierId")).sendKeys("krypton.mobile.demo");
        appiumDriver.findElement(By.id("identifierNext")).click();

        appiumDriver.findElement(By.xpath("//android.widget.EditText[@text='Enter your password']")).click();
        appiumDriver.findElement(By.xpath("//android.widget.EditText[@text='Enter your password']")).sendKeys("mobile.demo");
        appiumDriver.findElement(By.id("passwordNext")).click();
    }


}

