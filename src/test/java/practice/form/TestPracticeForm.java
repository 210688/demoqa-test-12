package practice.form;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

public class TestPracticeForm {
    RegistrationFormPage registrationFormPage;
    Faker faker = new Faker();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @BeforeEach
    void init() {
        registrationFormPage = new RegistrationFormPage(faker);
    }

    @Test
    void fillFormTests() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String number = faker.number().digits(10);
        String address = faker.address().fullAddress();
        String fullName = firstName + " " + lastName;
        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setNumber(number)
                .setDate()
                .clickRadioGender()
                .setSubjectInputEnglish("English")
                .setSubjectInputComputer("Computer science")
                .clickHobbies()
                .uploadFile("src/test/java/resources/555.jpg")
                .setAddress(address)
                .clickState()
                .clickUttarPradesh()
                .clickCity()
                .clickAgra()
                .clickSubmit()
                .checkText()
                .checkFieldStudentName(fullName)
                .checkFieldStudentEmail(email)
                .checkFieldGender()
                .checkFieldMobile(number)
                .checkDateOfBirth()
                .checkFieldSubjects()
                .checkFieldHobbies()
                .checkFieldPicture()
                .checkFieldAddress(address)
                .checkFieldStateAndCity()
                .closeButtonClose();
    }
}











