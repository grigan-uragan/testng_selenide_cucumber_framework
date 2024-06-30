package ru.grigan.testerFrame.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public abstract class BaseTest {

  public void setup() {
    WebDriverManager.chromiumdriver().setup();
    Configuration.pageLoadTimeout = 60000;
    Configuration.browser = "chrome";
    Configuration.webdriverLogsEnabled = true;
    Configuration.browserSize = "1920x1080";
    Configuration.headless = false;
  }

  @BeforeMethod
  public void init() {
    setup();
  }

  @AfterMethod
  public void tearDown() {
    Selenide.closeWebDriver();
  }
}