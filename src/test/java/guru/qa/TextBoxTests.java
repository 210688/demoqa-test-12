package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
     // Configuration.browserSize = "1366x768";
     // Configuration.timeout = 40000;
    }
    @Test
    void fillFormTests() {
     open("/text-box");

     String name = "Oleg Petrov";

     $("[id=userName]").setValue("name");
     $("[id=userEmail]").setValue("oleg@petrov.com");
     $("[id=currentAddress]").setValue("Some street 1");
     $("[id=permanentAddress]").setValue("Another street 2");
     $(".text-right").click();

     $("[id=output]").shouldHave(text("name"), text("oleg@petrov.com"),
             text("Some street 1"), text("Another street 2"));

        $("[id=output] [id=name]").shouldHave(text("name"));
        $("[id=output]").$("[id=name]").shouldHave(text("name"));

        //  $("[id=permanentAddress]").shouldHave(text("name"));

    }
}

