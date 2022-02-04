package tr.edu.ozyegin.ExamService.generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomDataGeneratorImplTest {

    RandomDataGeneratorImpl randomDataGenerator;
    private static final String REGEX = "[a-zA-Z]+";

    @BeforeEach
    void setUp() {
        randomDataGenerator = new RandomDataGeneratorImpl();
    }

    @Test
    void generateRandomString() {
        String randomString = randomDataGenerator.generateRandomString();
        assertTrue(randomString.matches(REGEX));
    }

    @Test
    void generateRandomIntBetween() {
        int randomInt = randomDataGenerator.generateRandomIntBetween(1,100);
        assertTrue(randomInt>0 && randomInt<101);
    }
}