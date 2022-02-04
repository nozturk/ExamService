package tr.edu.ozyegin.ExamService.generator;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomDataGeneratorImpl implements RandomDataGenerator{
    @Override
    public String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return  generatedString;
    }

    @Override
    public int generateRandomIntBetween(int min, int max) {
        Random rand = new Random();
        int randomNum = min + rand.nextInt((max - min) + 1);
        return randomNum;
    }
}
