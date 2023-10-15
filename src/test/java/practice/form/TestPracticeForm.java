package practice.form;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestPracticeForm {
    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "760x840";



    }
    @Test
    void fillFormTests() {
        open("/automation-practice-form");


        $("#firstName").setValue("Oleg");
        $("#lastName").setValue("Gordienko");
        $("#userEmail").setValue("agf@gmail.com");
        $("#userNumber").setValue("5696554564");
        $("[for = gender-radio-1]").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Computer science").pressEnter();
        $("#uploadPicture").uploadFile(new File("src/test/java/resources/lemur.jpg"));
        $("#currentAddress").setValue("Донецкая");
        $("#state").click();
        $(byText("Uttar Pradesh")).click();
        $("#city").click();
        $(byText("Agra")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(text("Oleg Gordienko"));
        $(".modal-body").shouldHave(text("agf@gmail.com"));
        $(".modal-body").shouldHave(text("Male"));
        $(".modal-body").shouldHave(text("5696554564"));
        $(".modal-body").shouldHave(text("English"));
        $(".modal-body").shouldHave(text("Computer science"));
        $(".modal-body").shouldHave(text("lemur.jpg"));
        $(".modal-body").shouldHave(text("Донецкая"));
        $(".modal-body").shouldHave(text("Uttar Pradesh Agra"));
        $(".modal-footer").shouldHave(text("Close"));



    }
}
