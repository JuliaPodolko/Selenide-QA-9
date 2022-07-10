package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTest {
    @Test
    void softAssertionsTestInGithub() {
        Configuration.browserSize = "1200x1000";
        //open repository page
        open("https://github.com/selenide/selenide");
        //open page SoftAssertions
        $("#wiki-tab").click();
        $("#wiki-pages-box li button").click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        //check: example JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
