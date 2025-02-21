package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {

    private SelenideElement userNameInput = $("#userName");
    private SelenideElement userEmailInput = $("#userEmail");
    private SelenideElement currentAddressInput = $("#currentAddress");
    private SelenideElement permanentAddressInput = $("#permanentAddress");
    private SelenideElement submitButton = $(".text-right");
    private SelenideElement output = $("#output");


    public TextBoxPage fillForm(String name, String email, String currentAddress, String permanentAddress) {
        userNameInput.setValue(name);
        userEmailInput.setValue(email);
        currentAddressInput.setValue(currentAddress);
        permanentAddressInput.setValue(permanentAddress);
        submitButton.click();
        return this;
    }


    public TextBoxPage verifyOutput(String name, String email, String currentAddress, String permanentAddress) {
        output.shouldHave(text(name), text(email), text(currentAddress), text(permanentAddress));
        output.$("#name").shouldHave(text(name));
        return this;
    }
}

