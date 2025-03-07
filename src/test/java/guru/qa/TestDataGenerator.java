package guru.qa;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class TestDataGenerator {
    private final Faker faker = new Faker();

    public String generateFirstName() {
        return faker.name().firstName();
    }

    public String generateLastName() {
        return faker.name().lastName();
    }

    public String generateEmail() {
        return faker.internet().emailAddress();
    }

    public String generateNumber() {
        return faker.number().digits(10);
    }

    public String generateAddress() {
        return faker.address().fullAddress();
    }

    public String generateFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String generateRandomDateOfBirth() {
        int minAge = 18;
        int maxAge = 50;
        int year = LocalDate.now().getYear() - ThreadLocalRandom.current().nextInt(minAge, maxAge + 1);
        int month = ThreadLocalRandom.current().nextInt(1, 13);
        int day = ThreadLocalRandom.current().nextInt(1, 31);
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dateOfBirth.format(formatter);
    }
}

