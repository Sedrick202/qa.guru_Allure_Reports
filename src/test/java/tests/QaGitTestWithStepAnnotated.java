package tests;

import org.junit.jupiter.api.Test;
import tests.steps.WebSteps;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class QaGitTestWithStepAnnotated {
    private static final String REPO = "eroshenkoam/allure-example";
    private static final String NUMBER = "69 nice";
    WebSteps webSteps  = new WebSteps();

    @Test
    public void gitTest(){
        webSteps.openPage();
        webSteps.searchRepo(REPO);
        webSteps.goToRepo(REPO);
        webSteps.openIssues();
        webSteps.checkIssue(NUMBER);
    }


}
