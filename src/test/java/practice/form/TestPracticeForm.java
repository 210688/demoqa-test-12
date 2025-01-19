package practice.form;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

import static com.codeborne.selenide.Selenide.$;

public class TestPracticeForm {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    @BeforeAll
    static void setUp() {
         Configuration.baseUrl = "https://demoqa.com";
         Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void fillFormTests() {
        registrationFormPage.openPage()
                .setFirstName("Oleg")
                .setLastName("Gordienko")
                .setEmail("agf@gmail.com")
                .setNumber("5696554564")
                .setDate()
                .clickRadioGender()
                .setSubjectInputEnglish("English")
                .setSubjectInputComputer("Computer science")
                .clickHobbies()
                .uploadFile("src/test/java/resources/555.jpg")
                .setAddress("Донецкая")
                .clickState()
                .clickUttarPradesh()
                .clickCity()
                .clickAgra()
                .clickSubmit()
                .checkText()
                .checkFieldStudentName()
                .checkFieldStudentEmail()
                .checkFieldGender()
                .checkFieldMobile()
                .checkDateOfBirth()
                .checkFieldSubjects()
                .checkFieldHobbies()
                .checkFieldPicture()
                .checkFieldAddress()
                .checkFieldStateAndCity()
                .closeButtonClose();
    }
}











