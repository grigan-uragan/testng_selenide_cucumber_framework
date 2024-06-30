package ru.grigan.testerFrame.page;

import com.codeborne.selenide.Selenide;

public abstract class BasePage<T> {
  public T open(String url) {
    Selenide.open(url);
    return (T)this;
  }
}
