package tr.edu.ozyegin.ExamService.service;

import tr.edu.ozyegin.ExamService.dto.ExamDTO;

public interface ExamService {
    ExamDTO getExam(Long id);
}
