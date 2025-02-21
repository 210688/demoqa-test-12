package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "firefox";

    }

    @Test
    void fillFormTests() {

        open("/text-box");

        TextBoxPage textBoxPage = new TextBoxPage();

        String name = "Oleg Petrov";
        String email = "oleg@petrov.com";
        String currentAddress = "Some street 1";
        String permanentAddress = "Another street 2";

        textBoxPage
                .fillForm(name, email, currentAddress, permanentAddress)
                .verifyOutput(name, email, currentAddress, permanentAddress);
    }
}



