package tr.edu.ozyegin.ExamService.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ExamDTO {
    private String isim;
    private String soyisim;
    private String ders;
    private int puan;
}