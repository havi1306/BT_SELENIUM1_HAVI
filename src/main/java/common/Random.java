package common;

import com.github.javafaker.Faker;
import common.constants.Constants;

public class Random {

    private static Faker faker = new Faker();

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomCharacters() {
        return faker.bothify("?????#####");
    }

    public static String getRandomNumbers() {
        return faker.number().digits(Constants.DEFAULT_NUMBER_OF_CHARACTERS);
    }
}
