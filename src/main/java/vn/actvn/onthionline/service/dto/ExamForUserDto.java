package vn.actvn.onthionline.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamForUserDto {
    private Integer id;
    private String name;
    private String image;
    private Integer numPeopleDid;
    private Integer time;
    private String description;
    private List<ExamQuestionForUserDto> examQuestions;
}
