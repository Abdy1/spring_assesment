import org.mapstruct.Mapping;

import com.yordanos_bekele.springassignment.Entity.SurveyRequest;
import com.yordanos_bekele.springassignment.dto.SurveyReposeDto;
import com.yordanos_bekele.springassignment.dto.SurveyRequestDto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SurveyMapper {

    SurveyRequest toEntity(SurveyRequestDto dto);

     @Mapping(target = "createdAt", expression = "java(formatDate(survey.getCreatedAt()))")
     SurveyReposeDto toResponse(SurveyRequest survey);

     default String formatDate(LocalDateTime dateTime) {
        if (dateTime == null) return null;
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

}
