package ma.pfe.controllers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentController {
    @Autowired
    private StudentService service;
    public StudentDTO create(StudentDTO dto) {
        return service.create(dto);
    }
    public StudentDTO update(StudentDTO dto) {
        return service.update(dto);
    }
    public boolean delete(long id) {
        return service.delete(id);
    }
    public List<StudentDTO> readAll() {
        return service.readAll();
    }
}
