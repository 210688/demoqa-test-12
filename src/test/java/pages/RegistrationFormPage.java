package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class RegistrationFormPage {
    private final SelenideElement
            setFirstName = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            numberInput = $("#userNumber"),
            clickGender = $(byText("Male")),
            setSubjectInput = $("#subjectsInput"),
            getHobbies = $("[for='hobbies-checkbox-1']"),
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
            checkDate = $(".modal-body"),
            checkFieldSubjects = $(".modal-body"),
            checkFieldHobbies = $(".modal-body"),
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
        numberInput.setValue(value);
        return this;
    }
    public RegistrationFormPage setDate() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select > [value = '1988']").click();
        $(".react-datepicker__month-select > [value = '5']").click();
        $(".react-datepicker__month .react-datepicker__day--021").click();
        return this;
    }

    public RegistrationFormPage clickRadioGender() {
        clickGender.click();
        return this;
    }

    public RegistrationFormPage setSubjectInputEnglish(String value) {
        setSubjectInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage setSubjectInputComputer(String value) {
        setSubjectInput.setValue(value).pressEnter();
        return this;
    }
    public RegistrationFormPage clickHobbies() {
        getHobbies.click();
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
        checkText.shouldHave(text("Thanks for submitting the form"));
        return this;
    }

    public RegistrationFormPage checkFieldStudentName() {
        checkFieldStudentName.shouldHave(text("Oleg Gordienko"));
        return this;
    }
    public RegistrationFormPage checkFieldStudentEmail() {
        checkFieldStudentEmail.shouldHave(text("agf@gmail.com"));
        return this;
    }
    public RegistrationFormPage checkFieldGender() {
        checkFieldGender.shouldHave(text("Male"));
        return this;
    }
    public RegistrationFormPage checkFieldMobile() {
        checkFieldMobile.shouldHave(text("5696554564"));
        return this;
    }
        public RegistrationFormPage checkDateOfBirth() {
        checkDate.shouldHave(text("21 June,1988"));
        return this;
    }
    public RegistrationFormPage checkFieldSubjects() {
        checkFieldSubjects.shouldHave(text("English, Computer Science"));
        return this;
    }
    public RegistrationFormPage checkFieldHobbies() {
        checkFieldHobbies.shouldHave(text("Sports"));
        return this;
    }
    public RegistrationFormPage checkFieldPicture() {
        checkFieldPicture.shouldHave(text("555.jpg"));
        return this;
    }
    public RegistrationFormPage checkFieldAddress() {
        checkFieldAddress.shouldHave(text("Донецкая"));
        return this;
    }
    public RegistrationFormPage checkFieldStateAndCity() {
        checkFieldStateAndCity.shouldHave(text("Uttar Pradesh Agra"));
        return this;
    }
    public RegistrationFormPage closeButtonClose() {
        checkButtonClose.click();
        return this;
    }
}
