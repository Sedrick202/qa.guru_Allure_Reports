package tests.steps;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;


public class WebSteps {
    @Step("Открываю новую страницу")
    public void openPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий {repository}")
    public void searchRepo(String repo) {
        $(".header-search-input").click();
        $(".header-search-input").setValue(repo).pressEnter();
    }

    @Step("Переходим в репозиторий")
    public void goToRepo(String repo) {
        $(linkText("eroshenkoam/allure-example")).click();
    }
    @Step("Там по issues")
    public void openIssues() {
        $$("#repository-container-header > nav ul li").get(1).$("#issues-tab").click();
    }
    @Step("Проверям номер {number}")
    public void checkIssue(String nubmer) {
        $(withText(nubmer)).should(visible);
    }
}
