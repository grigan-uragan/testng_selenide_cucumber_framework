package ru.grigan.testerFrame.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
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

  @BeforeTest
  public void init() {
    setup();
  }

  @AfterTest
  public void tearDown() {
    Selenide.closeWebDriver();
  }
}