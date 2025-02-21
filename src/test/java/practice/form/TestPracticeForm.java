package practice.form;

import com.github.javafaker.Faker;
import guru.qa.TextSetup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

public class TestPracticeForm extends TextSetup {
    RegistrationFormPage registrationFormPage;
    Faker faker = new Faker();

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

    @Test
    void RegistrationRequiredFieldsTest() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String number = faker.number().digits(10);
        String fullName = firstName + " " + lastName;
        registrationFormPage
                .openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .clickRadioGender()
                .setNumber(number)
                .clickSubmit()
                .checkFieldStudentName(fullName)
                .checkFieldGender()
                .checkFieldMobile(number);
    }

    @Test
    void incorrectFillFormTest() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .clickRadioGender()
                .setDate()
                .clickSubmit()
                .checkAbsenceFormResult();
    }
}














