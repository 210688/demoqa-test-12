package practice.form;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;
public class TestPracticeForm {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    @BeforeAll
    static void setUp() {
        // Configuration.holdBrowserOpen = true;
        // Configuration.baseUrl = "https://demoqa.com";
        // Configuration.browserSize = "768x1200";
    }
    @Test
    void fillFormTests() {
        registrationFormPage.openPage()
                .setFirstName("Oleg")
                .setLastName("Gordienko")
                .setEmail("agf@gmail.com")
                .setNumber("5696554564")
                .clickRadioGender()
                .setSubjectInput("English")
                .setHobbies("Computer science")
                .uploadFile("src/test/java/resources/lemur.jpg")
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
                .checkFieldSubjects()
                .checkFieldPicture()
                .checkFieldAddress()
                .checkFieldStateAndCity()
                .checkButtonClose();
    }
}











