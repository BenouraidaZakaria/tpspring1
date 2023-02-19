package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO create(StudentDTO dto);
    StudentDTO update(StudentDTO dto);
    boolean delete(long id);
    List<StudentDTO> readAll();
}
