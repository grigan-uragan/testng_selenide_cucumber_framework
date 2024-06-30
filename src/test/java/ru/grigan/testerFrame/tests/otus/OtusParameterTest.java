package ru.grigan.testerFrame.tests.otus;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.grigan.testerFrame.page.otus.OtusCatalogPage;
import ru.grigan.testerFrame.tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class OtusParameterTest extends BaseTest {

  private final static String BASE_URL = "https://otus.ru/catalog/courses";

  @DataProvider(name = "courseName")
  public static Object [][] courseName() {
    return new Object[][]{
          {"Java"},
          {"Python"}
    };
  }

  @Test(dataProvider = "courseName")
  public void parametersTest(String course) {
    String headerName = new OtusCatalogPage().open(BASE_URL).searchCourseByName(course).getHeaderName();
    assertTrue(headerName.contains(course));
  }
}
