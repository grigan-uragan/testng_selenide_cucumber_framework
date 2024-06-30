package ru.grigan.testerFrame.page.otus;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.grigan.testerFrame.page.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class CoursePage extends BasePage<CoursePage> {
  private final SelenideElement header = $x(".//h1");

  public String getHeaderName() {
    return header.shouldBe(Condition.visible, Duration.ofSeconds(10)).getText();
  }
}
