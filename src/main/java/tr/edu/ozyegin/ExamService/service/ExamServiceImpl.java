package tr.edu.ozyegin.ExamService.service;

import org.springframework.stereotype.Service;
import tr.edu.ozyegin.ExamService.dto.ExamDTO;
import tr.edu.ozyegin.ExamService.generator.RandomDataGenerator;

@Service
public class ExamServiceImpl implements ExamService {

    private final RandomDataGenerator dataGenerator;

    public ExamServiceImpl(RandomDataGenerator dataGenerator) {
            this.dataGenerator = dataGenerator;
        }

    @Override
    public ExamDTO getExam(Long id) {
        return ExamDTO.builder()
                .isim(dataGenerator.generateRandomString())
                .soyisim(dataGenerator.generateRandomString())
                .ders(dataGenerator.generateRandomString())
                .puan(dataGenerator.generateRandomIntBetween(1,100))
                .build();
    }

}
