package practice.form;

import com.github.javafaker.Faker;
import guru.qa.TestDataGenerator;
import guru.qa.TextSetup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;
@Tag("simple")
public class TestPracticeForm extends TextSetup {
    RegistrationFormPage registrationFormPage;
    TestDataGenerator testDataGenerator;

    @BeforeEach
    void init() {
        registrationFormPage = new RegistrationFormPage(new Faker());
        testDataGenerator = new TestDataGenerator();
    }

    @Test
    void fillFormTests() {
        String firstName = testDataGenerator.generateFirstName();
        String lastName = testDataGenerator.generateLastName();
        String email = testDataGenerator.generateEmail();
        String number = testDataGenerator.generateNumber();
        String address = testDataGenerator.generateAddress();
        String fullName = testDataGenerator.generateFullName(firstName, lastName);
        String dateOfBirth = testDataGenerator.generateRandomDateOfBirth();
        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setNumber(number)
                .setDate(dateOfBirth)
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
                .checkDateOfBirth(dateOfBirth)
                .checkFieldSubjects()
                .checkFieldHobbies()
                .checkFieldPicture()
                .checkFieldAddress(address)
                .checkFieldStateAndCity()
                .closeButtonClose();
    }

    @Test
    void RegistrationRequiredFieldsTest() {
        String firstName = testDataGenerator.generateFirstName();
        String lastName = testDataGenerator.generateLastName();
        String number = testDataGenerator.generateNumber();
        String fullName = testDataGenerator.generateFullName(firstName, lastName);
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
        String firstName = testDataGenerator.generateFirstName();
        String lastName = testDataGenerator.generateLastName();
        String dateOfBirth = testDataGenerator.generateRandomDateOfBirth();
        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .clickRadioGender()
                .setDate(dateOfBirth)
                .clickSubmit()
                .checkAbsenceFormResult();
    }
}
