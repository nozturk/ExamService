package tr.edu.ozyegin.ExamService.generator;

public interface RandomDataGenerator {
    String generateRandomString();
    int generateRandomIntBetween(int min, int max);
}
