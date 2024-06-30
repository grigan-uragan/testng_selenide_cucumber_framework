package ru.grigan.testerFrame.tests.otus;

import org.testng.annotations.Test;
import ru.grigan.testerFrame.page.otus.OtusCatalogPage;

import static org.testng.Assert.assertTrue;

public class OtusTest {
  private final static String BASE_URL = "https://otus.ru/catalog/courses";

  @Test
  public void searchCourseTest() {
    OtusCatalogPage otusCatalogPage = new OtusCatalogPage();
    String headerName = otusCatalogPage.open(BASE_URL)
          .searchCourseByName("Java")
          .getHeaderName();
    assertTrue(headerName.contains("Java"));
  }

  @Test
  public void searchPythonTest() {
    OtusCatalogPage otusCatalogPage = new OtusCatalogPage();
    String headerName = otusCatalogPage.open(BASE_URL)
          .searchCourseByName("Python")
          .getHeaderName();
    assertTrue(headerName.contains("Python"));
  }
}
