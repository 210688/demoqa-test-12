package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.io.File;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class RegistrationFormPage {
    private final SelenideElement
            setFirstName = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            clickGender = $("[for = gender-radio-1]"),
            setSubjectInput = $("#subjectsInput"),
            setHobbies = $("#subjectsInput"),
            uploadPicture = $("#uploadPicture"),
            setAddress = $("#currentAddress"),
            clickState = $("#state"),
            clickUttarPradesh = $(byText("Uttar Pradesh")),
            clickCity = $("#city"),
            clickAgra = $(byText("Agra")),
            clickSubmit = $("#submit"),
            checkText = $(".modal-header"),
            checkFieldStudentName = $(".modal-body"),
            checkFieldStudentEmail =  $(".modal-body"),
            checkFieldGender = $(".modal-body"),
            checkFieldMobile = $(".modal-body"),
            checkFieldSubjects = $(".modal-body"),
            checkFieldPicture = $(".modal-body"),
            checkFieldAddress = $(".modal-body"),
            checkFieldStateAndCity = $(".modal-body"),
            checkButtonClose = $(".modal-footer");


    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        setFirstName.setValue(value);
        return this;
    }

    public RegistrationFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }

    public RegistrationFormPage clickRadioGender() {
        clickGender.click();
        return this;
    }

    public RegistrationFormPage setSubjectInput(String value) {
        setSubjectInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage setHobbies(String value) {
        setHobbies.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage uploadFile(String value) {
        uploadPicture.uploadFile(new File(value));
        return this;
    }

    public RegistrationFormPage setAddress(String value) {
        setAddress.setValue(value);
        return this;
    }

    public RegistrationFormPage clickState() {
        clickState.click();
        return this;
    }

    public RegistrationFormPage clickUttarPradesh() {
        clickUttarPradesh.click();
        return this;
    }

    public RegistrationFormPage clickCity() {
        clickCity.click();
        return this;
    }

    public RegistrationFormPage clickAgra() {
        clickAgra.click();
        return this;
    }

    public RegistrationFormPage clickSubmit() {
        clickSubmit.click();
        return this;
    }

    public RegistrationFormPage checkText() {
        checkText.should(Condition.visible);
        return this;
    }

    public RegistrationFormPage checkFieldStudentName() {
        checkFieldStudentName.shouldHave(visible);
        return this;
    }
    public RegistrationFormPage checkFieldStudentEmail() {
        checkFieldStudentEmail.shouldHave(visible);
        return this;
    }
    public RegistrationFormPage checkFieldGender() {
        checkFieldGender.shouldHave(visible);
        return this;
    }
    public RegistrationFormPage checkFieldMobile() {
        checkFieldMobile.shouldHave(visible);
        return this;
    }
    public RegistrationFormPage checkFieldSubjects() {
        checkFieldSubjects.shouldHave(visible);
        return this;
    }
    public RegistrationFormPage checkFieldPicture() {
        checkFieldPicture.shouldHave(visible);
        return this;
    }
    public RegistrationFormPage checkFieldAddress() {
        checkFieldAddress.shouldHave(visible);
        return this;
    }
    public RegistrationFormPage checkFieldStateAndCity() {
        checkFieldStateAndCity.shouldHave(visible);
        return this;
    }
    public RegistrationFormPage checkButtonClose() {
        checkButtonClose.shouldHave(visible);
        return this;
    }
}
