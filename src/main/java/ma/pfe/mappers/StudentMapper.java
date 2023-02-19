package ma.pfe.mappers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentDTO convertToDTO(StudentEntity entity) {
        StudentDTO dto = new StudentDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
    public StudentEntity convertToEntity(StudentDTO dto) {
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    public List<StudentDTO> convertToDTOs(List<StudentEntity> entities) {
        return entities
                .stream()
                .map(entity->convertToDTO(entity))
                .collect(Collectors.toList());
    }
    public List<StudentEntity> convertToEntities(List<StudentDTO> dtos) {
        return dtos
                .stream()
                .map(dto->convertToEntity(dto))
                .collect(Collectors.toList());
    }
}
