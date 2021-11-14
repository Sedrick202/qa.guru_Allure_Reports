package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class QaGitTestWithLamdaSteps {
    private static final String REPO = "eroshenkoam/allure-example";
    private static final String NUMBER = "69 nice";
    @Test
    public void gitTest(){
        step("Открываю новую страницу",() -> {
                open("https://github.com/");
        });
        step("Ищем репозиторий " + REPO, () ->{
            $(".header-search-input").click();
            $(".header-search-input").setValue(REPO).pressEnter();
        });
        step("Переходим в репозиторий " + REPO, () ->{
            $(linkText(REPO)).click();
        });
        step("Там по issues ", () ->{
            $$("#repository-container-header > nav ul li").get(1).$("#issues-tab").click();
        });
        step("Проверям номер");
        $(withText(NUMBER)).should(visible);
    }


}
